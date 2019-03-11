import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class MainFrame extends JFrame {

	private DetailsPanel detailsPanel;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JList list;
	private String[] states;
	
	
	public MainFrame(String title) throws Exception {
		super(title);
		
		// set layout manager
		setLayout(new BorderLayout());
		
		// create array of state objects from state text file
		State[] s = ArrayBuilder.buildArray("stateInfo.txt");
		
		// create array of states to populate JList
		String[] states = new String[50];
		for(int i = 0; i < s.length; i++) {
			states[i] = s[i].getName();
		}
			
		
		// create swing components
		list = new JList(states);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// allows the list to be scrollable
		JScrollPane scrollPane = new JScrollPane(list);
		
		detailsPanel = new DetailsPanel();
		
		b1 = new JButton("Add State");
		b2 = new JButton("Remove State");
		b3 = new JButton("test");
		
		// add swing components to content panel
		Container c = getContentPane();
		
		// new panel to handle search and sort fields
		JPanel top = new JPanel(new BorderLayout());
		
		// new bottom panel for add/remove buttons
		JPanel bottom = new JPanel(new BorderLayout());
		
		// add content to the top panel
		top.add(b3, BorderLayout.CENTER);
		
		// add content to the bottom panel
		bottom.add(b1, BorderLayout.WEST);
		bottom.add(b2, BorderLayout.EAST);
		
		c.add(top, BorderLayout.NORTH);
		c.add(detailsPanel, BorderLayout.EAST);
		c.add(scrollPane, BorderLayout.CENTER);
		c.add(bottom, BorderLayout.SOUTH);
		
		// list action listener
		list.addListSelectionListener(
				new ListSelectionListener() {
					public void valueChanged(ListSelectionEvent event) {
						
					}
				}
		);
		
	}
}
