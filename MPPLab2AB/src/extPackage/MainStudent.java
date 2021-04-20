package extPackage;

import prob2A.GradeReport;
import prob2A.Student;

public class MainStudent {

	public static void main(String[] args) {
		
		//Navigating from Student to GradeReport
		Student stud=new Student("Eyob");
		stud.getGradeReport().addGrade("A+");
		System.out.println(stud.getName()+"->"+stud.getGradeReport().getGrade());
		
		//Navigating from GradeReport to Student 
		GradeReport gradeReport=stud.getGradeReport();
		gradeReport.addGrade("A+");
		System.out.println(stud.getName()+"->"+gradeReport.getGrade());
		
	}
	
}
