package gun3Odev2;

public class StudentManager extends UserManager {
	
	public void studentAdd(Student student) {
		
		System.out.println("Ekleme i�lemi ba�ar�l� :" + student.getStudentNumber() );
	}
	
	public void studentSave(Student student){
		
		System.out.println("Kay�t i�lemi ba�ar�l�" + student.getStudentNumber());
	}
	



	
	


	 

}
