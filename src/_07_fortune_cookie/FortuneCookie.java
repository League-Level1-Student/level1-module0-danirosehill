package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class FortuneCookie implements ActionListener {
	
	JFrame frame = new JFrame();
	
public void showButton()	{
	System.out.println("Button clicked");
	frame.setVisible(true);
	JButton button = new JButton();
	frame.add(button);
	frame.pack();
	button.addActionListener(this);
	
}


@Override
public void actionPerformed(ActionEvent e) {
	
	JOptionPane.showMessageDialog(null, "woohoo");
	int rand = new Random() .nextInt(3);
	
	if (rand ==0) {
		JOptionPane.showMessageDialog(null, "Stay away from anything green...");
		}
	
	if (rand ==1) {
	JOptionPane.showMessageDialog(null, "You will soon acquire great wealth.");
	}
	
	if (rand ==2) {
	JOptionPane.showMessageDialog(null, "Next Thursday will be your lucky day!");
	}
	
	if (rand ==3) {
	JOptionPane.showMessageDialog(null, "You're going to flunk a test soon, watch out!");
	}
	
}

}