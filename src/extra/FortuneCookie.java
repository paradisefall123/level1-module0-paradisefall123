package extra;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	public void showButton() {

		JFrame frame = new JFrame();
		JButton button = new JButton();
		System.out.println("Button clicked");
		frame.setVisible(true);
		frame.add(button);
		button.addActionListener(this);
		String url="https://www.google.com/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwiippH46uDdAhUaIDQIHQGSDUAQjRx6BAgBEAU&url=https%3A%2F%2Fwww.retro-gression.com%2Fproducts%2Ffortune-cookie&psig=AOvVaw1wqcO0AV4Xy1u0xMNJzwFX&ust=1538331870077540";
	 	Component image;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		int rand = new Random().nextInt(5);
		if(rand==0) {
			JOptionPane.showMessageDialog(null, "You will live long enough to open many fortune cookies.");
		}else if(rand==1) {
			JOptionPane.showMessageDialog(null, "The fortune you seek is in another cookie.");
		}else if(rand==2) {
			JOptionPane.showMessageDialog(null, "Don’t worry about money. The best things in life are free.");
		}else if(rand==3) {
			JOptionPane.showMessageDialog(null, "Don’t pursue happiness – create it.");
		}else if(rand==4) {
			JOptionPane.showMessageDialog(null, "If you want the rainbow, you have to tolerate the rain.");
		}
	}

}
