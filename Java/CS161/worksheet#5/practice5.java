
import java.util.Scanner;
import java.util.Random;
import java.awt.Color;
public class practice5{

	public practice5(){
	
	}
	public static void Lyrics(){
	
	System.out.println("Row, row, row your boat");
	System.out.println("Gently down the stream");
	System.out.println("Merrily, merrily, merrily merrily");
	System.out.println("Life is but a dream.\n\n");
	}
	
	public static int FourPower(int Number){
	
	int Ans = Number * Number * Number * Number;
	return Ans;
	}
	public static int Random100(){
	
	Random rand = new Random();
	int newrand = rand.nextInt(100) + 1;
	return newrand;
	}
	public static int RandomInRange(int begnum, int endnum){
	
	Random rand = new Random();
	int newrand = rand.nextInt(endnum - begnum +1) + begnum ;
	return newrand;
	}
	public static Color RandomColor(){
	
	Random rand = new Random();
	int red, green, blue;
	red = rand.nextInt(255);
	green = rand.nextInt(255);
	blue = rand.nextInt(255);
	
	Color color = new Color(red,green,blue);
	return color;
	
	}
}