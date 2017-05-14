#include <stdio.h>
#include <stdlib.h>


int main(int argc, char const *argv[])
{
	//http://stackoverflow.com/questions/9748393/how-can-i-get-argv-as-int
	// get from  arguments
	long max_capacity = strtol(argv[1],NULL, 10);
	long peepnum = strtol(argv[2],NULL, 10);
	if(max_capacity <= peepnum){
		printf("You are over max capicty. you can only hold your event here if you get rid of %ld pepole.\n", (max_capacity - peepnum) * -1);
	}
	else{
		printf("You can hold your event here.\n");
	}
	
	return 0;
}