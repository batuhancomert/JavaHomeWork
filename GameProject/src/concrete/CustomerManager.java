package concrete;

import Entities.Customer;
import abstractClass.CustomerService;
import abstractClass.UserValidationService;

public class CustomerManager implements CustomerService {
	private UserValidationService userValidationService;

	public CustomerManager(UserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Customer customer) {
		if (userValidationService.checkIfRealPerson(customer) == true) {
			System.out.println("Þahsiyet Eklendi " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Þahsiyet Eklenemedi " + customer.getFirstName() + " " + customer.getLastName());
		}

	}

	@Override
	public void update(Customer customer) {
		if (userValidationService.checkIfRealPerson(customer) == true) {
			System.out.println("Þahsiyet Güncellendi " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Þahsiyet Güncellenmedi " + customer.getFirstName() + " " + customer.getLastName());
		}

	}

	@Override
	public void delete(Customer customer) {
		if (userValidationService.checkIfRealPerson(customer) == true) {
			System.out.println("Þahsiyet Silindi " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Þahsiyet Silinemedi " + customer.getFirstName() + " " + customer.getLastName());
		}

	}

}
