import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class testdoc{
	public static void main(String[] args){
		System.out.println(fib(4));
	}
	public static int fib(int start){
        if (start <= 1){ 
        	return start;
        }
        else{ 
        	return fib(start -1) + fib(start-2);
    	}

	}
}
