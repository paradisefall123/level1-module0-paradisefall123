
public class Vault {
		int number;
		int secretCode;
		public Vault(int secretCode){
			this.secretCode=secretCode;
		}
	public boolean tryCode(int number) {
		if(number==secretCode) {
			return true;
		}else {
			return false;
		}
		
	
	}
	}

