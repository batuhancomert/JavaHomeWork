package gun2Odev;

public class Course {

	// Parametreli constructor operasyonları oluşturduk
	
	
	public Course(int courseId, String courseName, String price) {  
		this.courseId = courseId;
		this.courseName = courseName;
	}

	public Course(int courseId, String courseName, int price) {
		
		this.courseId = courseId;
		this.courseName = courseName;
	}

	int courseId;
	String courseName;

}
