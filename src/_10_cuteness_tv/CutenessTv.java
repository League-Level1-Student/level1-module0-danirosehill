package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTv implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel ();
	JButton button = new JButton("ducks");
	JButton button2 = new JButton("frogs");
	JButton button3 = new JButton("fluffy unicorns");
	
	public void showButtons() {
		
	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	panel.add(button2);
	panel.add(button3);
	frame.pack();
	button.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==button){
		   playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
		}
	if (e.getSource()==button2){
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
		}
	if (e.getSource()==button3){
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
		}
	}
		
	
	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't 
	     //work on some Linux implementations 
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] { 
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID }); 
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
