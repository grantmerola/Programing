#useing mysqlclient 1.3.9 even though it says mysqlldb
# mysqldb is a libary for reaching out and interacting with a mysql server (in this case mariadb)
#https://github.com/PyMySQL/mysqlclient-python  
#https://pypi.python.org/pypi/mysqlclient
# very usefull article about how to use lib
#https://mariadb.com/resources/blog/how-connect-python-programs-mariadb
import MySQLdb as mariadb
import csv
import datetime

# create connection object 
mariadb_connection = mariadb.connect(user='root', database='money')
# make cursor object (use this to involke commands)
cursor = mariadb_connection.cursor()
#a dictanary for doing look ups of the catagory names to there corasponding database id
lookup = { 'FOOD': 6, 'GROCERIES': 1, 'CLOTHING': 7, 'ECT.': 9, 'CHARITY': 8, 'CAR': 2, 'TECH': 5, 'TRAVEL': 3, 'INTERNET': 4 }

#with auto handels opening and closeing files pass open the file name and the way it is supposte to handle newlines
with open('Money - Expenditures copy.csv', newline='') as csvfile:
	# create reader object pass file object
	csvreader =csv.reader(csvfile)
	#iterate throught the line of the file
	for rows in csvreader:
		#redundent just for clarity
		current_row = rows
		# parse a date in the format month/day/year from positon 2 in the row just read
		dateus = datetime.datetime.strptime(current_row[2],"%m/%d/%Y")
		#format the date time object just created above in to the format year/month/day 
		datesql = datetime.datetime.strftime(dateus,"%Y-%m-%d")
		
		# try to excute on the server
		try:
			# execute sql   put     in   table        with             these              colums                     and           these                  values                                  which             correspond                   with            these             varables         
			cursor.execute("INSERT INTO expenses (item_name, cost, purchase_date, fk_categories_id, fk_person_id) VALUES ('{item_name}',{cost},'{purchase_date}',{cat_id},{person});".format(item_name=current_row[0],cost=current_row[1],purchase_date=datesql,cat_id=lookup[current_row[3]],person=1))
		
		#catch error	
		except mariadb as err:
			# print the error and the current row oprated apon 
			print("error:{}".format(err))
			print(current_row)

			# known problem with this error throwing exception that is (some what ironicly) not caught does not affect things much except that the current row is not printed 

# save the changes to the database
mariadb_connection.commit()
# thankfully will not excute if error is throw above so should only work if the script excutes with out errors

#close the connection to the database (good house keeping)
mariadb_connection.close()		
