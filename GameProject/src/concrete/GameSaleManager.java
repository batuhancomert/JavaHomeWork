package concrete;

import Entities.Campaing;
import Entities.Customer;

public class GameSaleManager {
	
	public void gameSale(Customer customer,Campaing campaing) {
		
		System.out.println(customer.getFirstName()+" " +customer.getLastName() +" �simli �ah�s :"+campaing.getCampaingName()+" Kampanyas� ile Oyunu Sat�n Ald�");
	}

}
