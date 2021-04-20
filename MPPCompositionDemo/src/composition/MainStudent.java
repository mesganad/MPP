package composition;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
	
	public static void main(String[] args) {
		
		Student s1=new Student("Misgan",612432, "MCSE");
		Student s2 =new Student("Meri",123, "MCSE");
		Student s3= new Student("Gher",223,"MSD");
		Student s4= new Student("Dani",443,"MSD");
		
		List<Student> studMSCS=new ArrayList<>();
		studMSCS.add(s1);
		studMSCS.add(s2);
		List<Student> studMSD=new ArrayList<>();
		studMSD.add(s3);
		studMSD.add(s4);
		
		Department mscs=new Department("MCSE", studMSCS);
		Department msd=new Department("MSD",studMSD);
		
	    List<Department> departments=new ArrayList<>();
	    departments.add(mscs);
	    departments.add(msd);
	    
	    Institute inst=new Institute("MIU", departments);
	    int count=inst.getTotalStudentsInInstitute();
	    System.out.println("Total no. students of the MIU: "+count);
	    
	    
	    
	}

}
