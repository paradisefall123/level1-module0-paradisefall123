import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JTextField field;
	JButton button;
	public static void main(String[] args) {
		BinaryConverter bi=new BinaryConverter();
		bi.createUi();
	
	}
	void createUi(){
		
		frame = new JFrame();
		panel=new JPanel();
		label=new JLabel();
		field=new JTextField(30);
		button=new JButton();


		frame.setVisible(true);
		frame.add(panel);
		frame.setTitle("Convert 8 bits of binary to ASCII");
		panel.add(field);
		panel.add(label);
		panel.add(button);
		button.setText("convert");
		button.addMouseListener(this);
		frame.pack();
		
	
	}String convert(String input) {
        if(input.length() != 8){
            JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
            return "-";
       }
       String binary = "[0-1]+";    //must contain numbers in the given range
       if (!input.matches(binary)) {
            JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
            return "-";
       }
       try {
            int asciiValue = Integer.parseInt(input, 2);
            char theLetter = (char) asciiValue;
            return "" + theLetter;
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
            return "-";
       }
  }
	
	 
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseClicked");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mousePressed");
		
	String s=field.getText();
		System.out.println(s);
String	c=convert(s);
		
		label.setText(c);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseReleased");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseEntered");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseExited");
	}
}
