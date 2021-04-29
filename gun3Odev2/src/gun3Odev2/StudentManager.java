package gun3Odev2;

public class StudentManager extends UserManager {
	
	public void studentAdd(Student student) {
		
		System.out.println("Ekleme işlemi başarılı :" + student.getStudentNumber() );
	}
	
	public void studentSave(Student student){
		
		System.out.println("Kayıt işlemi başarılı" + student.getStudentNumber());
	}
	



	
	


	 

}
