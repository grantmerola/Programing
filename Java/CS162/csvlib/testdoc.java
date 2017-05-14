import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.util.List;

public class testdoc{
	public static void main(String[] args){
		String file = "file.csv";
		csvlib newcsv = new csvlib();
		//ArrayList<List> test = newcsv.read(file);
		//for(int i=0;i < test.size();i++){
			//System.out.println(test.get(i).toString());
		//}
		/*
		if(newcsv.writeLines(file,array))
			System.out.println("true");
		else
			System.out.println("false");

		*/
		String[] ary = {"my ","kingdom ","for ","a ","horse " };
		if(newcsv.writeItem(file,"pleaseeeese",true));{
			System.out.println("one");
		}
		if(newcsv.writeLine(file,ary)){
			System.out.println("2");
		};
	}
}
/*
Design features: 
class hierarchy drawing.

Java features: 
√ recursive method, 
√ aggregate object, 
√ multi-dimensional array of objects, 
√ String, 
√ file IO, 
√ command line arguments,
√ GUI components with layout manager,
√ border, 
√ listener,
√ ArrayList,
√ inheritance, 
√ polymorphism, 
√ exception.
sorting
*/

