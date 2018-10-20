import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SoundEffectsMachine implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoundEffectsMachine fc= new SoundEffectsMachine();
	}public void showButton() {
	     System.out.println("Button clicked");
	     JFrame frame=new JFrame();
	     JButton button=new JButton();
	     frame.setVisible(true);
	     frame.add(button);
	     button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
