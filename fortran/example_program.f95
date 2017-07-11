! out of text book 'concepts of programming languages'
program example ! define program 'example'
implicit none ! in old fortran there were predefined variables implicit none clears those out. You must explicitly define all variables.

integer, dimension(99) :: int_list ! defines a dimension(array) size 99 of integers called int_list

integer :: list_len, counter, sum, average, result ! defines integers with the given names

result= 0 ! set result to 0

sum = 0 ! set sum to 0

print *, "Enter list size"

read * , list_len !read char from command line how does do we type verify, duck typing?

if ((list_len > 0) .AND. (list_len < 100)) then !if entered value is valid 
	do counter = 1, list_len ! loop from 1 to list_len
        read *, int_list(counter) ! read char reference that place in the list and store
        sum = sum + int_list(counter) ! sum the total entered values
	end do !exit loop
    average = sum/list_len ! get average

	do counter = 1, list_len ! loop from 1  to list_len
		if(int_list(counter) > average) then ! if any number in the array is greater than the average
            result = result + 1 ! count the number of values greater then the average 
		end if !exit if
	end do ! exit do
        print *, 'number of values > average is:', result ! print the number of values larger than the average
else ! 
        print *, 'error - list length value is not legal' ! error out for non valid list range
end if ! close if
end program example! close program 'example'