package prob2A;

public class Student {

	private String studentName;
	private GradeReport grade;
	
	public Student(String studentName) {
		this.studentName=studentName;
		grade=new GradeReport(this);
	}
	
	public GradeReport getGradeReport() {
		return this.grade;
	}
	public String getName() {
		return this.studentName;
	}
	
	@Override
	public String toString() {
		return studentName;
	}
}
