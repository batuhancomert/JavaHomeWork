package Main;

import Entities.Campaing;
import Entities.Customer;
import concrete.CampaingManager;
import concrete.CustomerManager;
import concrete.GameSaleManager;
import concrete.UserValidationManager;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(5, "Batuhan", "Cömert", 226548642, 1996);
		Customer customer2 = new Customer(6, "Yusuf", "Koçak", 84555654, 1997);
		
		CustomerManager customerManager = new CustomerManager(new UserValidationManager());
		
		customerManager.add(customer1);
		customerManager.add(customer2);
		System.out.println();
		
		Campaing campaing1 = new Campaing(1, "Ramazan Özel", "%25 indirim");
		Campaing campaing2 = new Campaing(2, "Sahura Doðru Kesintisiz Oyun", "%15");
		
		CampaingManager campaingManager = new CampaingManager();
		campaingManager.update(campaing1);
		campaingManager.add(campaing1);
		System.out.println();
		
		GameSaleManager gameSaleManager = new GameSaleManager();
		
		gameSaleManager.gameSale(customer1, campaing1);
		gameSaleManager.gameSale(customer2, campaing2);
		
	}
}
	
