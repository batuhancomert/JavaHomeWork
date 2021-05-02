package concrete;

import Entities.Customer;
import abstractClass.UserValidationService;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		if(customer.getBirtYear()<2004 && customer.getFirstName().length()>3 && customer.getLastName().length()>2 && customer.getNationalityId()>4) {
			System.out.println("Þahsiyet Doðrulandý ");
			
			return true;
		}else {
			System.out.println("Þahsiyet Doðrulanmaadý");
			
			return false;
		}
		
	}

}
