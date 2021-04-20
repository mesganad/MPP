package composition;

import java.util.List;

public class Institute {
	
	String name;
	private List<Department> departments;
	
	public Institute(String name, List<Department> departments) {
		
		this.name=name;
		this.departments=departments;
	}
	
	public int getTotalStudentsInInstitute(){
		
		int countStud=0;
		List<Student> stds;
		for(Department dept: departments) {
			
			stds=dept.getAllStudentsOfDepartment();
			
			for(Student s: stds) {
				countStud++;
			}
			
			
		}
		return countStud;
		
	}

}
