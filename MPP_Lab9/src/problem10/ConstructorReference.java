package problem10;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import problem7b.TriFunction;

class Human
{
	String name;
	int age;
	String gender;
	
	public Human(String name){
		this.name = name;
	}
	public Human(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public Human(String name,int age, String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
public static void main(String args[]){
	Human[] list = { new Human("Joe",35,"Male"), new Human("Jane",45,"Female"), new Human("John",30,"Male")};
	
    // Query 1  : Print only Female canditates names
	Arrays.stream(list)
	.filter(h->h.gender.equalsIgnoreCase("Female"))
	.forEach(h->System.out.println(h.getName()));

    // Query 2 : Create an object by choosing suitable Interface to the specified constructors
	//(Totally 3 constuctors)using fouth type of Method Reference ClassName::new. 
	//Then print the object status 
 
	//Constructor with one argument:
	Function<String, Human> h1= Human::new; //s->new Human(s)
	Human human1 = h1.apply("Maya");
	System.out.println("State of the first constructor: ");
	System.out.println(human1);
	
	//Constructor with 2 arguments:
	BiFunction<String,Integer,Human> h2=Human::new;
	Human human2=h2.apply("Maya", 2);
	System.out.println("State of the second constructor: ");
	System.out.println(human2);
	
	TriFunction<String,Integer,String,Human> h3=Human::new;
	Human human3=h3.apply("Maya", 2, "Female");
	System.out.println("State of the third constructor: ");
	System.out.println(human3);
	
	// Query 3 : Count the male candidates whose age is more than 30
	
	Long maleCounter=Arrays.stream(list)
	.filter(h->h.gender.equalsIgnoreCase("Male"))
	.filter(h->h.getAge()>30)
	.count();
    System.out.println("Number of male candidates whose age is more than 30: "+maleCounter);
    
    
   }



}
