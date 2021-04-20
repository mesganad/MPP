package proboneComposition;

public class Person {

	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	//@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		return isEqual;
	}


}
