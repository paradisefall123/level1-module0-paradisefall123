
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV  implements ActionListener {
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CutenessTV fc = new CutenessTV();
		fc.showButton();

	}
	
	public void showButton() {
		frame.add(panel);
		JButton button= new JButton();
		JButton leftButton=new JButton();
		JButton rightButton=new JButton();
		panel.add(leftButton);
		panel.add(rightButton);
		panel.add(button);
		System.out.println("Button clicked");
		leftButton.setName("leftbutton");
		rightButton.setName("rightbutton");
		button.setName("button");
		button.setSize(500, 500);
		leftButton.setSize(500, 500);
		rightButton.setSize(500, 500);
		button.setText("DuCkS");
		leftButton.setText("FrOgS");
		rightButton.setText("FlUfFy UnIcOrNs");
		button.addActionListener(this);
		leftButton.addActionListener(this);
		rightButton.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("Cuteness TV");
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		
		
		// TODO Auto-generated method stub
		if(buttonPressed.getName().equals("leftbutton")) {
		showFrog();
	
	} else if(buttonPressed.getName().equals("rightbutton")) {
		showFluffyUnicorns();
	}else {
		showDucks();
	}
	}
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     try {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
