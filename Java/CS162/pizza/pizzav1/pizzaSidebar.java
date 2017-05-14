import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class pizzaSidebar extends JPanel{

	//private theeye seesall = new theeye();
 	public static DefaultListModel listmodel = new DefaultListModel();
 	private static JLabel totallabel = new JLabel("Total: ");
 	//private JList<String> items = new JList<String>(seesall.getitemlist());
 	//private JList items = new JList(listmodel);
	

	public pizzaSidebar(theeye ineye){
		
		theeye seesall =ineye;

		setPreferredSize(new Dimension(500,70));
		//Box titlebox = new Box(BoxLayout.Y_AXIS);
		//titlebox.add(titlelabel);
			
		//Timer clock = new Timer(100,null);

		//clock.start();
		//clock.setDelay(100);
		//clock.addActionListener(new timerevent(seesall));
		//clock.setLogTimers(true);
		//boxes

		JLabel titlelabel = new JLabel("Your Order ------------------");
		add(titlelabel);

		//action listener file call
		pushme btn = new pushme(seesall);

		//items.setPreferredSize(new Dimension(200, 100));
		JList items = new JList(listmodel);
		items.setModel(listmodel);
		items.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //items.setSelectedIndex(0);
        //items.setVisibleRowCount(5);
        items.addListSelectionListener(btn.new selctionlistener(items));
		add(items);

		add(totallabel);

		JButton order = new JButton("Order Now");
		order.addActionListener(btn.new orderbtn());
		add(order);

		JButton remove = new JButton("Remove Item");
		remove.addActionListener(btn.new removebtn());
		add(remove);

		JButton clear = new JButton("Clear");
		clear.addActionListener(btn.new clearbtn());
		add(clear);

		
	}
	public static DefaultListModel getlistmodel(){
		return listmodel;
	}
	public static JLabel gettotallabel(){
		return totallabel;
	}

/*	public class timerevent implements ActionListener{

		public theeye tobepassed;
		public timerevent(theeye ineye){
			tobepassed = ineye;
		}

		public void actionPerformed(ActionEvent e){
			


				updatejlist(tobepassed);
				//listmodel.addElement("please bt");

			int num = seesall.getsize();

			//System.out.println(num);

			for(int i=0; i < num; i++){
				
				String tempstring = seesall.getitemlist()[i];
				
				System.out.println(tempstring);
				listmodel.addElement(tempstring);
			}

			if(listmodel.isEmpty()){
				//System.out.println("empty");
			}
			else{
				System.out.println("not empty");
			}
		}
	} 
*/

}