package gun3Odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " Numaral� / " + user.branch + " " + "Giri�i Yap�ld� : "  + user.getFirstName() + " " + user.getLastName());
	}
	
	public void userAdd(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
