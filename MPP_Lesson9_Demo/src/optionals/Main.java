package optionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		Person p=new Person("Misgan",null);

		//System.out.println(p.getEmail().map(e->e.toUpperCase()).orElse("Email not found"));
		p.getEmail().ifPresentOrElse(e->System.out.println(e.toUpperCase()), ()->System.out.println("Not found"));
	}

}

class Person{
	private  String name;
	private String email;
	public Person(String name, String email) {
		
		this.name = name;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}
	
	
	
	
}
