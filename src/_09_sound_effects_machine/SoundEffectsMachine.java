package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button= new JButton("sawing wood");
JButton button2= new JButton("jack in the box");
JButton button3= new JButton("drums");


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
	if(e.getSource()==button){
	playSound("sawing-wood-daniel_simon.wav");
	}
	else if(e.getSource()==button2){
		playSound("homer-woohoo.wav");
		}
	else if(e.getSource()==button3){
		playSound("drum.wav");
		}
}

private void playSound(String soundFile) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

}
