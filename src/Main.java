import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class Main {

	
	public static void main(String[] args) throws Exception{
		
		
		/*State[] s = ArrayBuilder.buildArray("stateInfo.txt");
		
	
		String[] stateList = new String[50];
		for(int i = 0; i < s.length; i++) {
			stateList[i] = s[i].getName();
		}*/
		
		// create a new thread for swing to run in
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				
				// Create a new JFrame 
				JFrame frame;
				
				
				try {
					frame = new MainFrame("USA");
					// set JFrame properties
					frame.setSize(500, 400);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
	}

}
