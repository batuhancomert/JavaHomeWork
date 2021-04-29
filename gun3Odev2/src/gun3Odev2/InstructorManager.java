package gun3Odev2;

public class InstructorManager extends UserManager {
	
	public void instructorAdd(Instructor instructor) {
		
		System.out.println("Ekleme iþlemi baþarýlý" + instructor.getInstructornumber() );
	}
	
	public void instructorSave(Instructor instructor) {
		
		System.out.println("Kayýt iþlemi baþarýlý" + instructor.getInstructornumber() );
	}
	



}
