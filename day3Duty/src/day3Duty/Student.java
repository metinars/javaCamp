package day3Duty;

public class Student extends User{
	private String course;
	private String completed;
	
	
	public String getCourse() {
		return course;
	}
	
	public void setCourse(String course) {
		this.course = course;
	}
	
	public String getCompleted() {
		return completed;
	}
	
	public void setCompleted(String completed) {
		this.completed = completed;
	}
}
