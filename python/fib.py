def fib(start1, start2, max):
	assert start1 >= 0 and start2 >= 0 and max >= 2
	x = start1
	y = start2
	fiblist = []
	for i in range(1,max+1):
		hold = y
		y = x + y
		x = hold
		print(x)
		fiblist.append(x)
	return fiblist

fib(0,1,50)