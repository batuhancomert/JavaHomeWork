package gun2Odev;

public class Main {

	public static void main(String[] args) {

		Course course1 = new Course(1, "C# ve Angular ",28);

		Course course2 = new Course(2,"Java ve React","Free");
		
		Course course3 = new Course(3,"Python","Free");
		
		Course[] courses = {course1,course2,course3};
		
		for(Course course : courses) {
			System.out.println(course.courseName);
		}
		System.out.println("----------------");
		
		CourseManager courseManager = new CourseManager();
		
		//Kurs Kayıt
		
		courseManager.register(course1);
		courseManager.register(course2);
		courseManager.register(course3);
		
		//Kurs Kayıt Silme
		
		courseManager.delete(course3);
	}
	
}
