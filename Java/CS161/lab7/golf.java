//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/14/15
//Date Completed: 
//lab#: 7
//Driver name:golfdriver.java
//program description: reads golf scores from a file and awards a winner
//test oracle:
/*
34334
par3 player1 1 player2 0 player3 0 player4 1
63876
par 6 player1 -3 player2 2 player3 1 player4 0
78652
par 7 player1 1 player2 -1 player3 -2 player4 -5
27678
par 2 player1 5 player2 4 player3 6 player4 4

//*/

import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.BufferedReader;


public class golf{
	
	
	public ArrayList<int[]> fromfile(String filename)throws IOException{
	

	String file = filename;
	
	FileReader reader = new FileReader(file);
	BufferedReader read = new BufferedReader(reader);
	
	ArrayList<String> scores = new ArrayList<String>(18);
	ArrayList<int[]> finalarray = new ArrayList<int[]>(18);
	//reading
	do{
	scores.add(read.readLine());
	System.out.println("scores array");
	System.out.println(Arrays.toString(scores.toArray()));

	}while(read.readLine()!= null);
	
		//makes strings in to int arrays it is true work of art
	for (int x =0;x < scores.size(); x++){
		String wantchar =scores.get(x);
		System.out.println("wantchar");
		System.out.println(wantchar);
		// string to char array
		char[] linearray = wantchar.toCharArray();
		System.out.println("Linearray");
		System.out.println(Arrays.toString(linearray));
	
		int[] endintarray = new int[5];
			//char array to int array
			for (int i=0;i < linearray.length; i++){
				endintarray[i] = Character.getNumericValue(linearray[i]);
				//System.out.println("each array stored");
				//System.out.println(Arrays.toString(finalarray.get(i)));
			}
		//array of arrays 
		finalarray.add(endintarray);
		System.out.println("the int arrays");
		System.out.println(Arrays.toString(finalarray.get(x)));
	}
	return finalarray;	
	//how to reference a array with in an array :) 
	//int m=finalarray.get(0)[0];

	//System.out.println(Arrays.toString(finalarray.get(0)));
	
	//System.out.println(Arrays.toString(linearray));
	
	//ArrayList<Integer> num = new ArrayList<Integer>(5);
	
	//for (char i : linearray){
	//num.add(Character.getNumericValue(i));
	//}
	
	//System.out.println(Arrays.toString(num.toArray()));
	
	
	}
}	
	
	
	
	//NOPE :(  RIP 3 hours
	/*
	FileReader reader = new FileReader("golfscores.txt");
	char[] numchars = new char[5];
	reader.read(numchars,0,5);
	System.out.println(numchars);
	reader.close();
	
	
	int i = 0;
	int startpos, endpos;
	//startpos = 0;
	endpos=5;
	ArrayList<char[]> holearray = new ArrayList<char[]>(18);
	
	while(i<17){

	System.out.println("count "+i);
	
	char[] put = new char[5];
	
	
	ArrayList<String> holenum = new ArrayList<String>(18);
	
	for(int x=0;x<=17;x++){
	
	int realholenum = x + 1;
	String holename = "hole: "+ realholenum ;
	
	holenum.add(x,holename);
	
	System.out.println(holenum.get(x));
	
	}
	 
	System.out.println(holenum.size());
	
	
	char[] holenum.get(i) = new char[5];
	
	
	//System.out.println(Arrays.toString(put));
	
	//reader.read(put,startpos,endpos);
	
	reader.read(put,0,endpos);
	
	System.out.println(Arrays.toString(put));
	
	//System.out.println("count2 "+i);
	
	holearray.add(i,put);
	put = null;
	
	//System.out.println("count3 "+i);
	
	//startpos = startpos + endpos ;
	endpos = endpos + 5;
	i++;
	//System.out.println("finish count "+i);
	}
	reader.close();
	//*/




