
public class PersonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person one = new Person("Levi", "Reading");
		Person two = new Person("Joe", "Pumping Iron");
		Person three = new Person("Hans", "Talking constantly");

		one.setSuperpower("fast reader");
		two.setSuperpower("pumping iron");
		three.setSuperpower("talking constantly");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
	}

	
}
