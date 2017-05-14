implicit none
integer dimension(99) :: int_list
integer :: list_len, counter, sum, average, result
result= 0
sum = 0
read * , list_len
if ((list_len > 0) .AND. (list_len < 100)) then
	do counter = 1, list_len
        read *, int_list(counter)
        sum = sum + int_list(counter)
	end do
    average = sum/list_len

	do counter = 1, list_len
		if(int_list(counter) > average) then
            result = result + 1
		end if
	end do
        print *, 'number of values > average is:', result
else
        print *, 'error - list length value is not legal'
end if
end program