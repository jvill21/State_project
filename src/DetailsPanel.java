import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class DetailsPanel extends JPanel {

	public DetailsPanel() throws Exception {
		Dimension size = getPreferredSize();
		size.width = 250;
		setPreferredSize(size);
		
		
		// setBorder(BorderFactory.createTitledBorder("State Info"));
		
		// set labels for state info
		JLabel nameLabel = new JLabel("Name: ");
		JLabel capitol = new JLabel("Capitol: ");
		JLabel population = new JLabel("Population: ");
		JLabel flower = new JLabel("State Flower: ");
		
		// label to display state info
		JLabel nameInfo = new JLabel("Default");
		JLabel capitolInfo = new JLabel("Default");
		JLabel populationInfo = new JLabel("Default");
		JLabel flowerInfo = new JLabel("Default");
		
		
		// set text fields to display state info
		// JTextField nameField = new JTextField(10);
		// JTextField capitolField = new JTextField(10);
		// JTextField populationField = new JTextField(10);
		// JTextField flowerField = new JTextField(10);
		
		// set a new grid bag layout
		setLayout(new GridBagLayout());
		
		GridBagConstraints gc = new GridBagConstraints();
		
		
		// set layout for first column of labels
		gc.anchor = GridBagConstraints.LINE_START;
		gc.weightx = 0;
		gc.weighty = 0;
		gc.gridx = 0;
		gc.gridy = 0;
		add(nameLabel, gc);
		
		gc.gridy = 1;
		add(capitol, gc);
		
		gc.gridy = 2;
		add(population, gc);
		
		gc.gridy = 3;
		add(flower, gc);
		
		// set layout for second column of text fields
		gc.anchor = GridBagConstraints.LINE_START;
		gc.gridx = 1;
		gc.gridy = 0;
		add(nameInfo, gc);
		
		gc.gridy = 1;
		add(capitolInfo, gc);
		
		gc.gridy = 2;
		add(populationInfo, gc);
		
		gc.gridy = 3;
		add(flowerInfo, gc);
	}
}
