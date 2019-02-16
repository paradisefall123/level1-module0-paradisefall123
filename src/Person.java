
public class Person {
	private String name;
	private String superpower;
	
	public Person(String name, String superpower) {
		this.name=name;
		this.superpower=superpower;
	}
	 public String getName(){
	return name;	
	}
	 public String getSuperpower() {
		 return superpower;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public void setSuperpower( String superpower) {
		 this.superpower=superpower;
	 }
	 @Override
		public String toString() {
			return getName() + " has mad " + getSuperpower() + " skills";
		}
}
