def fizzbuzz(start, end):
	for x in range(start,end+1):
		if (x%3 or x%5) == 0:
			print('%d Fizzbuzz' % x)
		elif x%3 == 0:
			print('%d Fizz' % x)
		elif x%5 == 0 :
			print('%d Buzz' % x)
		else:
			print('%d' % x)
	return

fizzbuzz(1,100)