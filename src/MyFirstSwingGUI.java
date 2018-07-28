/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */


import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public static void main(String[] args) {
		//1. Create and initialize an object of the JFrame class
             JFrame wendy= new JFrame() ;
		//2. Set your JFrame object to be visible
             wendy.setVisible(true);
		//3. Run your program. Do you see your window? It's probably very small.
		
		//4. Set the default close operation to JFrame.EXIT_ON_CLOSE
             	wendy.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//5. Create and initialize an object of the JPanel class
             	JPanel guadalupe=new JPanel();
		//6. Create and initialize an object of the JLabel class
                 JLabel gonzalez= new JLabel();
		//7. Set the text of the JLabel to a lovely greeting.
                    gonzalez.setText("Hello");
		//8. Add the JPanel object to the JFrame
                    wendy.add(guadalupe);
		//9. Add the JLabel object to the JPanel
                    guadalupe.add(gonzalez);
		//10. Pack your JFrame.
                    	wendy.pack();
		//11. Run your program again. Do you see your message.
		
		//12. Use the loadImage method to set the icon of the JLabel object.  
                  ImageIcon Valentin=loadImage();
                  gonzalez.setIcon(Valentin);
		//13. Re-pack the JFrame object.
                  	wendy.pack();
		//14. Run the program one more time. Do you see the image?
	}
	
	public static ImageIcon loadImage(){
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			
			return null;
		}
	}
}
