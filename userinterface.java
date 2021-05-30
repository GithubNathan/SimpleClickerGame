package GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class userinterface implements ActionListener {
	
	int count = 0;
	int level = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;
	JButton button;
	JLabel Level;
	
	public userinterface() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Click me!");
		Level = new JLabel("Level: " + level);
		
		
		button.addActionListener(this);
		
		label = new JLabel("Number of clicks: 0");
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(Level);
		panel.add(label);
		
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("My GUI");
		frame.pack();
		frame.setVisible(true);
		
		
		
		
	}

	public static void main(String[] args) {
		
		new userinterface();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(level == 0) {
			count++;
			label.setText("Number of clicks: " + count);
			
		}
		
		if (count == 15) {
			
			JLabel label2 = new JLabel("Upgrade 1 Achieved! Clicks doubled.");
			frame.add(label2);
			level++;
			
			
		}
		
		if (level == 1) {
			count += 2;
			label.setText("Number of clicks: " + count);
		}
		
		if (count >= 100) {
			JLabel label3 = new JLabel("Upgrade 2 Achived! Clicks tripled.");
			frame.add(label3);
			level++;
		}
		
		if (level == 2) {
			count += 3;
			label.setText("Number of clicks: " + count);
		}
		
		
	}
	
}
