import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SoundEffectsMachine implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoundEffectsMachine fc = new SoundEffectsMachine();
		fc.showButton();
	}

	public void showButton() {
		JFrame frame = new JFrame();
		JButton button = new JButton();
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(4);
		if(rand==0){
			playSound("dixiehorn.wav");
		}else if(rand==1){
			playSound("halloween.wav");
		}else if(rand==2){
			playSound("pianocrash.wav");
		}else if(rand==3){
			playSound("cartoon.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
