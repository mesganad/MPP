package proboneComposition;


public class PersonWithJob  {

	private Person person;
	private double salary;
	
	
	PersonWithJob(String name, double salary) {
		person = new Person(name);
		this.salary = salary;
	}
	public String getName() {
		return person.getName();
	}
	public double getSalary() {
		return salary;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public static void main(String[] args) {
		//PersonWithJob instances
		PersonWithJob pj1 = new PersonWithJob("Joe", 30000);
		PersonWithJob pj2 = new PersonWithJob("Joe", 30000);
		//pj1 should be equal to pj2
		System.out.println("pj1.equals(pj2)? " + pj1.equals(pj2));
		System.out.println("pj2.equals(pj1)? " + pj2.equals(pj1));

		//Person objects are created through PersonWithJob objects--composition
		Person p1 = pj1.person; //pj1 aggregates p1
		Person p2 = pj2.person; //pj2 aggregates p2
		//p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));


	}


}
