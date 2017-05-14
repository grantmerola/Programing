import java.util.Random;


public class sudosolver{
	public static void main(String[] args){
		//the rules
		//rng solver
		//input method static of asked mabey gui
		//output method 	
	
	
		/*input
	
	
	
		//*/
		int[][] puz = new int[][]{
                {null,2,null,4,null,null,6,null,null},
                {9,null,null,2,null,null,1,5,3},
                {null,7,6,null,null,null,4,null,9},
                {6,null,null,null,9,null,8,4,null},
                {null,null,9,7,null,6,3,null,null},
                {null,1,5,null,8,null,null,null,6},
                {8,null,2, null,null,null,5,3,null},
                {1,6,3,null,null,2,null,null,4},
                {null,null,4,null,null,8,null,6,null}
		};

        for(int i=0;i<100;i++){
            System.out.println(rng());
        }
    };

    public static int rng(){

        Random rng = new Random();
        rngnum = nextInt(9)+1;
        return rngnum;
    }
}
