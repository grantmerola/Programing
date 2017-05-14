
def add(item_name_, cost_, purchase_date_, cat_id_, type_id_, person_id=1, second_name='null',database='money'):


	#useing mysqlclient 1.3.9 even though it says mysqlldb
	# mysqldb is a libary for reaching out and interacting with a mysql server (in this case mariadb)
	#https://github.com/PyMySQL/mysqlclient-python  
	#https://pypi.python.org/pypi/mysqlclient
	# very usefull article about how to use lib
	#https://mariadb.com/resources/blog/how-connect-python-programs-mariadb
	import MySQLdb as mariadb
	import sys
	import argparse
	import datetime

	# create connection object 
	mariadb_connection = mariadb.connect(user='root', database=database)
	# make cursor object (use this to involke commands)
	cursor = mariadb_connection.cursor()

	def typelookup(type_name):
	#a dictanary for doing look ups of the catagory names to there corasponding database id
		lookup_dict = {'cash':2, 'debit':1}
		return lookup_dict[type_name]

	def lookup(catagory_name):
		#a dictanary for doing look ups of the catagory names to there corasponding database id
		lookup_dict = { 'FOOD': 6, 'GROCERIES': 1, 'CLOTHING': 7, 'ECT.': 9, 'CHARITY': 8, 'CAR': 2, 'TECH': 5, 'TRAVEL': 3, 'INTERNET': 4 }
		return lookup_dict[catagory_name]

	def convert_date(date_string_us_standard):
		# parse a date in the format month/day/year from positon 2 in the row just read
		dateus = datetime.datetime.strptime(date_string_us_standard,"%m/%d/%Y")
		#format the date time object just created above in to the format year/month/day 
		datesql = datetime.datetime.strftime(dateus,"%Y-%m-%d")
		return datesql

	# try to excute on the server
	try:
		# execute sql   put     in   table        with             these              colums                     and           these                  values                                  which             correspond                   with            these             varables         
		cursor.execute("INSERT INTO expenses (item_name, secondary_name, cost, purchase_date, fk_payment_type_id, fk_categories_id, fk_person_id) VALUES ('{item_name}','{secondary_name}',{cost},'{purchase_date}',{type_id},{cat_id},{person});".format(item_name=item_name_,secondary_name=second_name,cost=cost_,purchase_date=convert_date(purchase_date_),type_id=typelookup(type_id_),cat_id=lookup(cat_id_),person=person_id))

	#catch error	
	except mariadb as err:
		# print the error and the current row oprated apon 
		print("error:{}".format(err))

		# known problem with this error throwing exception that is (some what ironicly) not caught does not affect things much 

	# save the changes to the database
	mariadb_connection.commit()
	# thankfully will not excute if error is throw above so should only work if the script excutes with out errors

	#close the connection to the database (good house keeping)
	mariadb_connection.close()		



