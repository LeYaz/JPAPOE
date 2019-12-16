package com.filrouge.poe.lyon.JPAPOE;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;
import com.filrouge.poe.lyon.JPAPOE.service.IDevisService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.ClientService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.DevisService;

public class TestDevis {

	private static Dao dao;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}

	@Test
	public void testAllDevis() {
		IDevisService devisservice = new DevisService(dao);
		 List<Devis> ld = devisservice.allDevis();
		 
		 ld.forEach(l -> System.out.println(l));
	}
	
//	@Test
//	public void testAddDevis() {
//		IDevisService devisservice = new DevisService(dao);
//		IClientService clientservice = new ClientService(dao);
//		IUserService userservice = new UserService(dao);
//		IVehiculeService vehiculeservice = new VehiculeService(dao);
//		Devis d = new Devis();
//		d.setClient(clientservice.findClient(1));
//		d.setUser(userservice.findUser(1));
//		d.setVehicule(vehiculeservice.findVehicule(1));
//		d.setDatecreation(new Date());
//		devisservice.ajouterDevis(d);
//		this.testAllDevis();
//	}
	
	@Test
	public void testAllNamedDevis() {
		IDevisService devisservice = new DevisService(dao);
		 List<Devis> ld = devisservice.requetenamed("Devis.findAll");
			ld.stream().forEach(s -> System.out.println(s));

	}
	
	@Test
	public void testAllNamedDevisByClient() {
		IDevisService devisservice = new DevisService(dao);
		IClientService clientservice = new ClientService(dao);
		 List<Devis> ld = devisservice.requetenamed("Devis.findByClient", clientservice.findClient(1).getId());
			ld.stream().forEach(s -> System.out.println(s));
	}
	
	@Test
	public void testDevisByClient() {
		IClientService clientservice = new ClientService(dao);
		List<Devis> ld = clientservice.findDevisByClient(1);
		ld.forEach(d->System.out.println("id :"+d.getId()+ ", Date de création : "+d.getDatecreation()));
	}
	
	@Test
	public void testAfficheClientDevis() {
		IDevisService devisservice = new DevisService(dao);
		Client c = devisservice.devisAfficheClient(1);
		System.out.println(c);
	}
	
	@Test
	public void testAfficheUserDevis() {
		IDevisService devisservice = new DevisService(dao);
		User u = devisservice.devisAfficheUser(1);
		System.out.println(u);
	}
	
	@Test
	public void testAfficheVehiculeDevis() {
		IDevisService devisservice = new DevisService(dao);
		Vehicule v = devisservice.devisAfficheVehicule(1);
		System.out.println(v);
	}

}
