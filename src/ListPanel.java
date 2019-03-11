import java.awt.Dimension;

import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class ListPanel extends JPanel {

	public ListPanel() throws Exception {
		// Dimension size = getPreferredSize();
		// size.width = 250;
		// setPreferredSize(size);
		
		State[] s = ArrayBuilder.buildArray("stateInfo.txt");
		
		
		String[] stateList = new String[50];
		for(int i = 0; i < s.length; i++) {
			stateList[i] = s[i].getName();
		}
		
		// create list
		JList list = new JList(stateList);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);
		list.setVisibleRowCount(-1);
		
		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(250, 80));
	}
	
}
