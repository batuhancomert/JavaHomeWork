package concrete;

import Entities.Campaing;
import Entities.Customer;

public class GameSaleManager {
	
	public void gameSale(Customer customer,Campaing campaing) {
		
		System.out.println(customer.getFirstName()+" " +customer.getLastName() +" Ýsimli Þahýs :"+campaing.getCampaingName()+" Kampanyasý ile Oyunu Satýn Aldý");
	}

}
