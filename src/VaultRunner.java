
public class VaultRunner {
	public static void main(String[] args) {
		Vault vovo = new Vault(97);
		JamesBond nono = new JamesBond();
		int code=nono.findCode(vovo);
		System.out.println("I found the secret code " +code);
	}

}
