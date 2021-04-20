package inheritanceToComposition;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[])
	{
		PersonRole ob1 = new Staff();
		PersonRole ob2 = new Student();
		List<PersonRole> role = new ArrayList<>();
		role.add(ob1);
		role.add(ob2);
		Person ob = new Person("John", "David", role);
		System.out.println(ob);
		ob.duties();
			
	}
}
