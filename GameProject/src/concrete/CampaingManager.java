package concrete;

import Entities.Campaing;
import abstractClass.CampaingService;

public class CampaingManager implements CampaingService {

	@Override
	public void add(Campaing campaing) {
		System.out.println("Kampanya Eklendi");
		
	}

	@Override
	public void update(Campaing campaing) {
		System.out.println("Kampanya G�ncellendi");
		
	}

	@Override
	public void remove(Campaing campaing) {
		System.out.println("Kampanya Kald�r�ld�");
		
	}

}
