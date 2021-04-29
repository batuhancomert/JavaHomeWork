package gun3Odev2;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId() + " Numaralı / " + user.branch + " " + "Girişi Yapıldı : "  + user.getFirstName() + " " + user.getLastName());
	}
	
	public void userAdd(User[] users) {
		for (User user : users) {
			add(user);
		}
	}

}
