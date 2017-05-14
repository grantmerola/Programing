import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.BorderFactory;
import javax.swing.text.JTextComponent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
//*/
/*
	VERSION: 1
	every thing should be turned in with the exception of week 9 assign
	recursion is in the check file name method
	exceptions is in delete in csvlib
	some sorting is done in someThingSorting()
	
	NOTE:
	pass file name in as argument, file.csv is attached for easy use
	
	requires Java 8
	still a few bugs but there hard to find 
	god daum i REALLY need to figure out git
	Modify at your own risk

	Linecount: 461	
	Change: N/A
	Sourcefilecount: 3
	Classfilecount: 3 

	Drawn extensivly from the Oracle Documnation 

*/

public class csvViewer{

	private static String fileName;
	private static boolean checkState = false;
	public static void main(String[] args){
		// Do you want to debug
		if(args.length > 0){
			fileName = args[0];
			checkFileName();
		}
				someThingSorting();	
		csvlib lib = new csvlib();

		// just making a frame  
		JFrame frame = new JFrame("csvViewer");	

				JTextArea area = new JTextArea(readFile(),40,40);

			JScrollPane pane = new JScrollPane(area);
			
	 				JTextComponent infield = new JTextField(20);
					JLabel wrlLabel = new JLabel("Input");
					JButton wrLbtn = new JButton("Write Line");
				JPanel wrl = new JPanel();

					JCheckBox endofline = new JCheckBox("End of Line?",false);
					JTextField inPutString = new JTextField(20);
					JLabel stringHere = new JLabel("Input");
					JButton writeItem = new JButton("Write Item");
				JPanel soone = new JPanel();
			JPanel con = new JPanel();
		
		JPanel data = new JPanel();

		con.setBorder(BorderFactory.createLoweredSoftBevelBorder());

		endofline.addActionListener(e->{
			checkState = !checkState;
		});

		writeItem.addActionListener(e->{
			lib.writeItem(fileName,inPutString.getText(),checkState);
			area.setText(readFile());
		});	
		wrLbtn.addActionListener(e ->{
			
			String[] ary = new String[1];
			ary[0] = infield.getText();
			lib.writeLine(fileName,ary);
			area.setText(readFile());
		});
		
		
		wrl.add(infield);
		wrl.add(wrlLabel);
		wrl.add(wrLbtn);
		soone.add(writeItem);
		soone.add(stringHere);
		soone.add(inPutString);
		soone.add(endofline);
		con.add(soone);
		con.add(wrl);
		//data you have the con
		data.add(con,BorderLayout.NORTH);
		data.add(pane,BorderLayout.CENTER);
		
		

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.getContentPane().add(data);	
		frame.pack();
		frame.setVisible(true);	
	}
	//*/

	public static void newFileName(){
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextLine()){
			fileName = scan.nextLine();
		}
	}

	// checks that the file name is kosher also technical memory leak but not in any way that matters 
	public static void checkFileName(){
		if(!fileName.equals("")){
			char[] nameArray = fileName.toCharArray();
			String fileEnding = new String(Arrays.copyOfRange(nameArray,(nameArray.length-4),nameArray.length));
			switch(fileEnding){
				case ".csv":
					break;
				default:
					System.out.println("File Name Argument was invalid please input a correct one.");
					System.out.println("A correct file name is the path and ends in \".csv\"");
					newFileName();
					checkFileName();
			}
		}
		else{
			System.out.println("File Name Argument was invalid please input a correct one.");
			System.out.println("A correct file name is the path and ends in \".csv\"");
			newFileName();
			checkFileName();
		}
	}


	public static String readFile(){
		FileReader reader = null;
		
		try{
		reader = new FileReader(fileName);
		}
		catch(IOException e){
			System.out.println("FileReader creation failure");
			e.printStackTrace();
		}

		BufferedReader read = new BufferedReader(reader);
		
		String line = "";
		
		try{
			read.mark(8000);
				int i = 0;
				String str;
				while( ( str=read.readLine() ) != null){
					line += str+"\n";
					i++;
				};
				read.reset();
		}
		catch(IOException e){
			System.out.println("could not read from file");
			e.printStackTrace();
		}
		return line;
	}

	public static void someThingSorting(){
		csvlib lib = new csvlib();
		ArrayList<List> test = lib.read(fileName);
		for(int i=0; i< test.size();i++){
			Collections.sort(test.get(i)); 
			System.out.println(test.get(i).toString());
		}
	}	
}