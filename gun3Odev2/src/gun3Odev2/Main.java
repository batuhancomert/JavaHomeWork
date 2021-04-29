package gun3Odev2;

public class Main {

	public static void main(String[] args) {
		
		InstructorManager instructor1 = new InstructorManager();
		
		
		instructor1.setId(102);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("DEMÝROÐ");
		instructor1.setBranch("Eðitmen");
		instructor1.setCourse("C#");
		instructor1.setInstructornumber("2035664");
		
		instructor1.setEmail("engindemirog@gmail.com");
		instructor1.setPassword("465487987");
		
		
		
		
		StudentManager student1 = new StudentManager();
		
		
		student1.setId(103);
		student1.setFirstName("Batuhan");
		student1.setLastName("CÖMERT");
		student1.setStudentNumber("108655");
		student1.setCourse("JAVA");
		student1.setBranch("Öðrenci");
		
		student1.setEmail("batuhan@gmail.com");
		student1.setPassword("5555555");
		
		UserManager userManager = new UserManager();
		
		User[] users = {student1,instructor1};
		
		userManager.userAdd(users);
		
		System.out.println("--------------");
		
		Logger logger = new Logger();
		logger.log(student1);
		logger.log(instructor1);
		
		
		
		
		
		
		

	}

}
