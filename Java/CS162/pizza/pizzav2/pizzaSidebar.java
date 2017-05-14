import java.awt.Dimension;
//import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;

public class pizzaSidebar extends JPanel{

 	public static DefaultListModel listModel = new DefaultListModel();
 	private static JLabel totalLabel = new JLabel("Total: ");

	public pizzaSidebar(theeye ineye, boolean inbol){
		boolean debug = inbol;
		theeye seesAll =ineye;

		setPreferredSize(new Dimension(500,70));

		// title label
		JLabel titleLabel = new JLabel("Your Order ------------------");
		add(titleLabel);

		//action listener file call
		pushme btn = new pushme(seesAll, debug);

		// items lsit
		JList items = new JList(listModel);
		items.setModel(listModel);
		items.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        items.addListSelectionListener(btn.new selctionListener(items));
		add(items);

		//total label defined at top
		add(totalLabel);

		// order btn
		JButton order = new JButton("Order Now");
		order.addActionListener(btn.new orderBtn());
		add(order);

		// Remove btn
		JButton remove = new JButton("Remove Item");
		remove.addActionListener(btn.new removeBtn());
		add(remove);

		// Clear btn
		JButton clear = new JButton("Clear");
		clear.addActionListener(btn.new clearBtn());
		add(clear);		
	}
	// Retuns the List Model
	public static DefaultListModel getListModel(){
		return listModel;
	}
	// Returns the Total Label
	public static JLabel getTotalLabel(){
		return totalLabel;
	}
}