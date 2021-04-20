package prob2A;

public class GradeReport {
	private Student student;
	private String grade;
	GradeReport(Student student){
		this.student=student;
	}
	public void addGrade(String grade) {
		this.grade=grade;
	}
	public Student getStudent() {
		return this.student;
	}
	public String getGrade() {
		return this.grade;
	}
	 
	
	

}
