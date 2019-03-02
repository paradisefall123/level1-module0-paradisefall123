import javax.swing.JOptionPane;

public class TeaParty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isWoman && !isKnighted) { 
			return "Hello Ms. "+name;
			
	}else if(isWoman && isKnighted) {
		return "Hello Lady "+name;
	}else if(!isWoman && !isKnighted) {
		return "Hello Mr. "+name;
	}else {
		return "Hello Sir "+name;
	}
		
}
}