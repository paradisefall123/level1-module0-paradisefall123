
public class JamesBond {
	public JamesBond() {
	}

	// TODO Auto-generated method stub
	public int findCode(Vault bobo) {

		for (int i = 0; i < 1000001; i++) {
			if (bobo.tryCode(i)) {
				return i;
			}
			
		}
		return -1;
	}
	
}
