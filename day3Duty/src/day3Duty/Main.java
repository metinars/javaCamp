package day3Duty;

public class Main {

	public static void main(String[] args) {
        Student ogrenci1 = new Student();
        ogrenci1.setFullName("Hüseyin Sarıçam");
        ogrenci1.setEmail("metin@gmail.com");
        ogrenci1.setPassword("12345");
        ogrenci1.setId(1);
        ogrenci1.setCourse("Java");
        ogrenci1.setCompleted("33");
        
       StudentManager studentmanager = new StudentManager();
       studentmanager.add(ogrenci1);
       
        Instructor instructor1 = new Instructor();
        instructor1.setFullName("Hüseyin Sarıçam");
        instructor1.setEmail("hüseyin@gmail.com");
        instructor1.setPassword("12345");
        instructor1.setId(2);
        instructor1.setGivenCourses("Java");
        
        
       InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

	}

}
