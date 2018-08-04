/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class BodyPartQuiz {

	// 0. You can use the celebrity photos we have placed in the default java package,  
	// or if you prefer, get celebrity photos from the Internet, place them in the default
	// package, and change the names below.
	
	String arnold = "src/arnold.jpeg";
	String leonardo = "src/leonardo.jpeg";
	String morgan = "src/morgan.jpeg";
	String jack = "src/jack.jpeg";
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();


	private void startQuiz() {

		// 1. Make an int variable to hold the score.
		int score=0;
		// 2. Set the size of the window in the initializeGui() method below
			
		for (int i = 0; i < 4; i++) {
			
			// 4. Ask the user who this person is and store their answer
			String guess= JOptionPane.showInputDialog("who is this?");
			
			// 5. Check their answer. If they guessed correctly:
			// -- Tell them they are right and increase the score by 1
if(guess.equalsIgnoreCase("arnold")) {

	JOptionPane.showMessageDialog(null,"CORRECT");
	score++;
	
}else {
	JOptionPane.showMessageDialog(null, "INCORRECT, the person is Arnold");
}
			// 6. Otherwise:
			// -- Tell them they are wrong and who the person is

			// 7. Use the showNextImage() method below to get the next image
			showNextImage();
		    // 8. Show them their current score
			JOptionPane.showMessageDialog(null, "Your score is"+score);
			// 9. .... repeat for all your images.....


		}

	}

	public void showNextImage() {
		panel.removeAll();
		panel.add(getNextImage());		
		window.setVisible(true);
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.add(panel);
		window.setSize(-10, 127);
		// 3. Change the size of the window so that you can only see part of the image.		
	
		
		showNextImage();
		
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel label = new JLabel(icon);
		
		return label;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(arnold);
		
		imageList.add(imageLabel);
		imageLabel = loadImage(leonardo);
		imageList.add(imageLabel);
		imageLabel = loadImage(morgan);
		imageList.add(imageLabel);
		imageLabel = loadImage(jack);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		System.exit(0);
		return new JLabel();
	}
}
