package gun3Odev2;

public class InstructorManager extends UserManager {
	
	public void instructorAdd(Instructor instructor) {
		
		System.out.println("Ekleme i�lemi ba�ar�l�" + instructor.getInstructornumber() );
	}
	
	public void instructorSave(Instructor instructor) {
		
		System.out.println("Kay�t i�lemi ba�ar�l�" + instructor.getInstructornumber() );
	}
	



}
