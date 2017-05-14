//Name: Grant Merola
//Class: CS161 Spring 2015
//Class Times: MWF 800
//Date Started:5/14/15
//Date Completed: 5/16/15
//lab#: 7
//Driver name:N/A, this file
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
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class golfdriver{


	public static void main(String[] args)throws IOException{
	System.out.println("----------DEBUGGING INFO----------");
	golf g = new golf();
		
	ArrayList<int[]> keep = g.fromfile("golfscores.txt");
	ArrayList<Integer> p1 = new ArrayList<Integer>(18);
	ArrayList<Integer> p2 = new ArrayList<Integer>(18);
	ArrayList<Integer> p3 = new ArrayList<Integer>(18);
	ArrayList<Integer> p4 = new ArrayList<Integer>(18);
	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(18);
		for(int h=0; h < keep.size();h++) {
		
		int[] scores = new int[4];
		
		int par = keep.get(h)[0];
		int s1 = keep.get(h)[1];
		int s2 = keep.get(h)[2];
		int s3 = keep.get(h)[3];
		int s4 = keep.get(h)[4];
		
		scores[0] = s1;
		scores[1] = s2;
		scores[2] = s3;
		scores[3] = s4;
		
		ArrayList<Integer> slist = new ArrayList<Integer>(4);
			
			for(int sitem : scores){
			
			slist.add(-1 * (par - sitem));
		list.add(slist);	
			}
		System.out.println("the score array");
		System.out.println(Arrays.toString(slist.toArray()));
		
		p1.add(s1);
		p2.add(s2);
		p3.add(s3);
		p4.add(s4);

		}
		
	int p1scoreprecompare,p2scoreprecompare,p3scoreprecompare,p4scoreprecompare;
	p1scoreprecompare = 0;
	p2scoreprecompare = 0;
	p3scoreprecompare = 0;
	p4scoreprecompare = 0;
	
		for(int x : p1){
		p1scoreprecompare += x;
		}
	
		for(int x : p2){
		p2scoreprecompare += x;
		}
	
		for(int x : p3){
		p3scoreprecompare += x;
		}
	
		for(int x : p4){
		p4scoreprecompare += x;
		}
	//http://www.quickprogrammingtips.com/java/find-smallest-number-in-an-array-using-java.html
	//because there should be a native method for this
	int[] totalscore = {p1scoreprecompare,p2scoreprecompare,p3scoreprecompare,p4scoreprecompare};
	int largestsofar = Integer.MAX_VALUE;
		for(int c = 0; c < totalscore.length; c++){
			if(largestsofar > totalscore[c]){
			largestsofar = totalscore[c];
			}
		}
	String winner = "";
	
	
		if(largestsofar == p1scoreprecompare){ 
		winner = "Player1";
		}
	
		else if(largestsofar == p2scoreprecompare){
		winner = "Player2";
		}
		else if(largestsofar == p3scoreprecompare){
		winner = "Player3";
		}
		else if(largestsofar == p4scoreprecompare){
		winner = "Player4";
		}
	
	
	
	
	System.out.println("p1");
	System.out.println(Arrays.toString(p1.toArray()));
	System.out.println("p2");
	System.out.println(Arrays.toString(p2.toArray()));
	System.out.println("p3");
	System.out.println(Arrays.toString(p2.toArray()));
	System.out.println("p4");
	System.out.println(Arrays.toString(p4.toArray()));
//System.out.println(Arrays.toString(keep.get(0)));
	System.out.println("p1scoreprecompare");
	System.out.println(p1scoreprecompare);
	System.out.println("p2scoreprecompare");
	System.out.println(p2scoreprecompare);
	System.out.println("p3scoreprecompare");
	System.out.println(p3scoreprecompare);
	System.out.println("p4scoreprecompare");
	System.out.println(p4scoreprecompare);
	
	
	System.out.println("----------OUTPUT----------\n");
	System.out.println("FINAL SCORES\n");
	System.out.println("Player#1");
	System.out.println("Player one had a total of " + p1scoreprecompare + " strokes.");
	System.out.println("Player#2");
	System.out.println("Player two had a total of " + p2scoreprecompare + " strokes.");
	System.out.println("Player#3");
	System.out.println("Player three had a total of " + p3scoreprecompare + " strokes.");
	System.out.println("Player#4");
	System.out.println("Player four had a total of " + p4scoreprecompare + " strokes.");
	System.out.println("\nWINNER\n");
	System.out.println("The Winner is " + winner);
    System.out.println("\n\n");
    System.out.println("              SCORES               ");
    System.out.println(" HOLE | PAR | P1 | P2 | P3 | P4 ");
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("  1   |"+ keep.get(0)[0]+"    | "+list.get(0).get(0)+"  | "+list.get(0).get(1)+"  | "+list.get(0).get(2)+"  | "+ list.get(0).get(3));
	System.out.println("  2   |"+ keep.get(1)[0]+"    | "+list.get(4).get(0)+"  | "+list.get(4).get(1)+"  | "+list.get(4).get(2)+"  | "+ list.get(4).get(3));
	System.out.println("  3   |"+ keep.get(2)[0]+"    | "+list.get(8).get(0)+"  | "+list.get(8).get(1)+"  | "+list.get(8).get(2)+"  | "+ list.get(8).get(3));
	System.out.println("  4   |"+ keep.get(3)[0]+"    | "+list.get(12).get(0)+"  | "+list.get(12).get(1)+"  | "+list.get(12).get(2)+"  | "+ list.get(12).get(3));
	System.out.println("  5   |"+ keep.get(4)[0]+"    | "+list.get(16).get(0)+"  | "+list.get(16).get(1)+"  | "+list.get(16).get(2)+"  | "+ list.get(16).get(3));
	System.out.println("  6   |"+ keep.get(5)[0]+"    | "+list.get(20).get(0)+"  | "+list.get(20).get(1)+"  | "+list.get(20).get(2)+"  | "+ list.get(20).get(3));
	System.out.println("  7   |"+ keep.get(6)[0]+"    | "+list.get(24).get(0)+"  | "+list.get(24).get(1)+"  | "+list.get(24).get(2)+"  | "+ list.get(24).get(3));
	System.out.println("  8   |"+ keep.get(7)[0]+"    | "+list.get(28).get(0)+"  | "+list.get(28).get(1)+"  | "+list.get(28).get(2)+"  | "+ list.get(28).get(3));
	System.out.println("  9   |"+ keep.get(8)[0]+"    | "+list.get(32).get(0)+"  | "+list.get(32).get(1)+"  | "+list.get(32).get(2)+"  | "+ list.get(32).get(3));
	System.out.println(" 10   |"+ keep.get(9)[0]+"    | "+list.get(36).get(0)+"  | "+list.get(36).get(1)+"  | "+list.get(36).get(2)+"  | "+ list.get(36).get(3));
	System.out.println(" 11   |"+ keep.get(10)[0]+"    | "+list.get(40).get(0)+"  | "+list.get(40).get(1)+"  | "+list.get(40).get(2)+"  | "+ list.get(40).get(3));
	System.out.println(" 12   |"+ keep.get(11)[0]+"    | "+list.get(44).get(0)+"  | "+list.get(44).get(1)+"  | "+list.get(44).get(2)+"  | "+ list.get(44).get(3));
	System.out.println(" 13   |"+ keep.get(12)[0]+"    | "+list.get(12*4).get(0)+"  | "+list.get(12*4).get(1)+"  | "+list.get(12*4).get(2)+"  | "+ list.get(12*4).get(3));
	System.out.println(" 14   |"+ keep.get(13)[0]+"    | "+list.get(13*4).get(0)+"  | "+list.get(13*4).get(1)+"  | "+list.get(13*4).get(2)+"  | "+ list.get(13*4).get(3));
	System.out.println(" 15   |"+ keep.get(14)[0]+"    | "+list.get(14*4).get(0)+"  | "+list.get(14*4).get(1)+"  | "+list.get(14*4).get(2)+"  | "+ list.get(14*4).get(3));
	System.out.println(" 16   |"+ keep.get(15)[0]+"    | "+list.get(15*4).get(0)+"  | "+list.get(15*4).get(1)+"  | "+list.get(15*4).get(2)+"  | "+ list.get(15*4).get(3));
	System.out.println(" 17   |"+ keep.get(16)[0]+"    | "+list.get(16*4).get(0)+"  | "+list.get(16*4).get(1)+"  | "+list.get(16*4).get(2)+"  | "+ list.get(16*4).get(3));
	System.out.println(" 18   |"+ keep.get(17)[0]+"    | "+list.get(17*4).get(0)+"  | "+list.get(17*4).get(1)+"  | "+list.get(17*4).get(2)+"  | "+ list.get(17*4).get(3));
	

	
	}
	
}