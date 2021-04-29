package gun2Odev;

public class CourseManager {
	
	public void register(Course course) {
		
		// Her sayfada çalışabilmesi için kayıt olma ve kayıt silme işlemlerini metot haline getirdik
		
		System.out.println("Kayıt Olundu : " + course.courseName);  
	}
	
	public void delete(Course course) {
		
		System.out.println("Kayıt Silindi : " + course.courseName );
	}

}
