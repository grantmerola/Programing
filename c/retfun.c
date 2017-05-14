#include <stdio.h>

int equals(char *str1, int len1, char *str2, int len2);

int main(int argc, char const *argv[])
{
	int len1 = sizeof(argv[1])/sizeof(char);
	int len2 = sizeof(argv[2])/sizeof(char);
	return equals(argv[1],len1, argv[2],len2);
}
int equals(char *str1, int len1, char *str2, int len2){
		int count = 0;
	
	while(str1[count] == str2[count]){
		
		if(str1[count] == '\0'){
			printf("equals\n");
			return 1;
		}
		else{
			count++;
		}
	}
	printf("not equals\n");
	return 0;
}