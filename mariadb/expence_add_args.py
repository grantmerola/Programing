import argparse
import expence_add

parser = argparse.ArgumentParser(description='add entry to expence table in money database')
parser.add_argument('-s','--secondary-name', nargs='?',default='null',help='Secondary Name is for if you want to add more specifying info such as (item name:pizza, secondary name: pizza brand)')
parser.add_argument('item',help='name of the item')
parser.add_argument('cost',help='cost of the item, In format: 122234324.32 no dollar sign and no commas')
parser.add_argument('date',help='Date, In format: MM/DD/YYYY')
parser.add_argument('catagory_name',choices=['FOOD', 'GROCERIES', 'CLOTHING', 'ECT.', 'CHARITY', 'CAR', 'TECH', 'TRAVEL', 'INTERNET'],help='Catagory Name, Options are: FOOD, GROCERIES, CLOTHING, ECT., CHARITY, CAR, TECH, TRAVEL, INTERNET')
parser.add_argument('-p','--person',nargs='?',default='1',help='for specifying another person besides me')
parser.add_argument('-t','--payment-type',nargs='?',choices=['debit', 'cash'],default='debit',help='for specifying payment type')

args = parser.parse_args()
expence_add.add(args.item, args.cost, args.date, args.catagory_name,args.payment_type,args.person,args.secondary_name)
