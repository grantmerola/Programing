import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class csvlib{
	//vars that exist in multiple methods
	public boolean debug = false;	
	
	public csvlib(){
			
	}
		
	// alternate debug constructor
	public csvlib(boolean inbol){
		debug= inbol;
	}

	// read from file
	public ArrayList<List> read(String file){
			FileReader reader =null;
			try{
			reader = new FileReader(file);
			}
			catch(IOException e){
				System.out.println("FileReader creation failure");
				e.printStackTrace();
			}
			// creating the buffered reader
			BufferedReader read = new BufferedReader(reader);
			//array that will hold all the lines
			ArrayList<String> lines = new ArrayList<String>();
			//how many lines
			int linecount =0;
			//array of lists that is returned
			ArrayList<List> linesWords = new ArrayList<List>();
			//can read?
			try{
				//ready to read?
				if(read.ready()){
					int i = 0;
					do{
					//read and store in array of lines 
					lines.add(read.readLine());
					i++;
					}while(read.ready()!=false);
					//while i can read do so
					//the number of lines read i.e. the size of the array
					linecount = i;
				}
			}
			//tell if file reading failed 
			catch(IOException e){
				System.out.println("could not read from file");
				e.printStackTrace();
			}
				if(debug){
				System.out.println("linecount: "+linecount);
					for(int i=0; i<lines.size();i++){
					System.out.println(lines.get(i));
					}
				}
			//look for comments "//" and remove them
			for (int i =0;i<lines.size();i++) {
				if(lines.get(i).charAt(0) =='/' && lines.get(i).charAt(1)=='/'){
					lines.remove(i);
					linecount -= 1;
				}
			}
				if(debug)
					System.out.println(linecount+" linecount has changed");
			
			//split and store in out array
			for (int i =0;i<linecount;i++) {
				//get me the i string in the array
				String tempString = lines.get(i);

				//splits on "," delimiter
				String[] tempArray= tempString.split("[,]");
				
				//converts array to list and stores in arraylist
				linesWords.add(Arrays.asList(tempArray));
			}
			//return arraylist of lists
			return linesWords;
	}

	//write just one string tell whether it is the last in the line
	public boolean writeItem(String file,String stringToBeWriten,boolean endofline){
		FileWriter writer= null;
		try{
		writer = new FileWriter(file,true);
		}
		catch(IOException e){
			System.out.println("FileWriter creation failure");
			e.printStackTrace();
		}
		//create a writer
		BufferedWriter write = new BufferedWriter(writer);
		// if it is the end of the line write with \n
		if(endofline){
			try{
			write.write(stringToBeWriten + "\n");
			write.close();
			}
			catch(IOException e){
				e.printStackTrace();
				return false;
			}
		}
		// else just write
		else{
			try{
			write.write(stringToBeWriten+",");
			write.close();
			}
			catch(IOException e){
				e.printStackTrace();
				return false;
			}
		}
		//return whether the writing was successful
		return true;				
	}

	// write a array to a file
	public boolean writeLine(String file,String[] stringsToBeWriten){
		FileWriter writer = null;
		try{
		writer = new FileWriter(file,true);
		}
		catch(IOException e){
			System.out.println("FileWriter creation failure");
			e.printStackTrace();
		}
		//create writer
		BufferedWriter write = new BufferedWriter(writer);
		// string that will be construted
		String constructedString = "";
		//for all the strings in the array add them to one another in order with the delimiter ",", if count is not last in the array
		for(int i =0;i<stringsToBeWriten.length;i++){
			if(i != stringsToBeWriten.length)
			constructedString += stringsToBeWriten[i] +",";
		}
		//try to write note close is required
		try{
		write.write(constructedString+"\n");
		write.close();
		}
		//return whether it secceded
		catch(IOException e){
			e.printStackTrace();
			return false;
		}	
		return true;
	}

	//write a 2d array of strings to file
	public boolean writeLines(String file,String[][] stringsToBeWriten){
		FileWriter writer =null;
		try{
		writer = new FileWriter(file,true);
		}
		catch(IOException e){
			System.out.println("FileWriter creation failure");
			e.printStackTrace();
		}
		//intilize the buffered writer
		BufferedWriter write = new BufferedWriter(writer);
		//count thorugh the first level of the array
		for(int i =0; i<stringsToBeWriten.length;i++){
			//the string that will be made
			String constructedString = "";
			//run through each string in the second level of the array
			for(int l=0; l<stringsToBeWriten[i].length;l++){
				//if the loop is not on the last element of the array of strings, then concat the strings in order sperating them with the "," delimiter
				if(l != stringsToBeWriten[i].length)
					constructedString += stringsToBeWriten[i][l] +",";
				}
				//try to write them to the file catch failure and return failure
				try{
				write.write(constructedString+"\n");
				//not close is requred for the writer to flush the stream and acttualy write to the file
				write.close();
				}
				catch(IOException e){
					e.printStackTrace();
					return false;
				}
		}
		return true;	
	}

	//clear the file
	public void delete(String file){
		//create file object from the constructors file name
		File thefile = new File(file);
		//try to erase the file
		try{
			//deleate the file
			if(thefile.delete()){
				//try to create a new file of the same name
				try{
					thefile.createNewFile();
				}
				//if it dosen't work catch the error and tell that we were unable to make the new file in the place of the old one
				catch(IOException e){
					System.out.println("new file creation failed");
					e.printStackTrace();
				}
			
			}
			// else throw error
			else{
				throw new fileDeletionException();
			}
		}
		//
		catch(fileDeletionException e){
		}
	}
	//v2
	//delate more specificly 
	//write 2d not append?
	//write with line specified 
}