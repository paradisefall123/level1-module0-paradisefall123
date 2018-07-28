/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
                String url="https://d2c8orla013wc0.cloudfront.net/from-blog/port_of_busan_south_korea.jpg";
		// 2. create a variable of type "Component" that will hold your image
                	Component image;
		// 3. use the "createImage()" method below to initialize your Component
                image=	createImage(url);
		// 4. add the image to the quiz window
                	quizWindow.add(image);
		// 5. call the pack() method on the quiz window
                	quizWindow.pack();
		// 6. ask a question that relates to the image
         String answer=JOptionPane.showInputDialog("What country was the picture taken in?");
		// 7. print "CORRECT" if the user gave the right answer
             	if(answer.equalsIgnoreCase("South korea")) {
             		JOptionPane.showMessageDialog(null, "CORRECT");
             	}
             	else {
             		JOptionPane.showMessageDialog(null, "INCORRECT");
             	}
		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
             		quizWindow.remove(image);
		// 10. find another image and create it (might take more than one line of code)
             		String memorial="http://www.dronestagr.am/wp-content/uploads/2018/01/Photo-Aug-23-7-42-24-PM-1200x800.jpg";
             		Component pic;
             		pic=createImage(memorial);
             		quizWindow.add(pic);
             		quizWindow.pack();
		// 11. add the second image to the quiz window
             			String quiz=JOptionPane.showInputDialog("What memorial is this?");
             			if(quiz.equalsIgnoreCase("9/11 memorial")) {
             				JOptionPane.showMessageDialog(null, "CORRECT");
             			}else {
             				JOptionPane.showMessageDialog(null, "INCORRECT");
             			}
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





