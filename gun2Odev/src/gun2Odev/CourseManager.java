package gun2Odev;

public class CourseManager {
	
	public void register(Course course) {
		
		// Her sayfada �al��abilmesi i�in kay�t olma ve kay�t silme i�lemlerini metot haline getirdik
		
		System.out.println("Kay�t Olundu : " + course.courseName);  
	}
	
	public void delete(Course course) {
		
		System.out.println("Kay�t Silindi : " + course.courseName );
	}

}
