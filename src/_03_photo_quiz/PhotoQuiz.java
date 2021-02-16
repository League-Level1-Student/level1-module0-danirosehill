package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		
		String dog= "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/golden-retriever-royalty-free-image-506756303-1560962726.jpg?crop=1.00xw:0.756xh;0,0.0756xh&resize=980:*";
		
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		
		// 2. create a variable of type "Component" that will hold your image
		
		Component image = createImage(dog);

		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		
		quizWindow.add(image);

		// 5. call the pack() method on the quiz window
		
		quizWindow.pack();

		// 6. ask a question that relates to the image
		
		String answer = JOptionPane.showInputDialog("Is this dog cute?");

		// 7. print "CORRECT" if the user gave the right answer
		
		if (answer.equals("yes")) {
			System.out.println("correct");
		}

		// 8. print "INCORRECT" if the answer is wrong
		
		if (answer.equals("no")) {
			System.out.println("incorrect");
		}

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		
		quizWindow.remove(image);

		// 10. find another image and create it (might take more than one line
		// of code)
		
		String cat = "https://i.ytimg.com/vi/_-ssNsbP7wA/maxresdefault.jpg";
		Component image2 = createImage (cat);
		

		// 11. add the second image to the quiz window
		
		quizWindow.add(image2);

		// 12. pack the quiz window
		
		quizWindow.pack();

		// 13. ask another question
		
		String answer2= JOptionPane.showInputDialog("Is this cat cute?");
	

		// 14+ check answer, say if correct or incorrect, etc.
		if (answer2.equals("yes")) {
			System.out.println("incorrect");
		}
		
		if (answer2.equals("no")) {
			System.out.println("correct");
		}

	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
