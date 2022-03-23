package day3Duty;

public class StudentManager extends UserManager{
	public void add(Student student) {
		System.out.println("Kurs: " + student.getCourse());
		System.out.println("%" + student.getCompleted() + " tamamlandı");
	}
}
