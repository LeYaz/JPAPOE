package com.filrouge.poe.lyon.JPAPOE;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.ClientService;



public class TestDao {
	private static Dao dao;
	private static Client c;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dao = new Dao();
		dao.init();
		c  = new Client();
		c.setName("Aadnan");
		c.setFirstname("Yazid");
		c.setAdresse("Rue 30");
		c.setCodepostal("69100");
		c.setPortable("65");
		c.setTel("40");
		c.setVille("Villeurbanne");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		dao.close();
	}

	@Test
	public void testfindClient() {
		IClientService clientservice = new ClientService(dao);
		System.out.println(clientservice.findClient(1));
	}
	
	@Test
	public void testfindAllClient() {
		IClientService clientservice = new ClientService(dao);
		List<Client> lc = clientservice.findAll();
		lc.stream().forEach(s -> System.out.println(s));
		
	}
	
	@Test
	public void testAddClient() {
		IClientService clientservice = new ClientService(dao);
		
		clientservice.ajouterClient(c);
		this.testfindAllClient();
		
	}
	
	@Test
	public void testSupprimerClient() {
		IClientService clientservice = new ClientService(dao);
		
		clientservice.supprimerClient(c);
		this.testfindAllClient();
		
	}
	
	@Test
	public void testNamedAllClient() {
		IClientService clientservice = new ClientService(dao);
		List<Client> lc = clientservice.requetenamed("Client.findAll");
		lc.stream().forEach(s -> System.out.println(s));
		
	}
	
	@Test
	public void testNamedParamClient() {
		IClientService clientservice = new ClientService(dao);
		List<Client> lc = clientservice.requetenamed("Client.findByName", "C%");
		lc.stream().forEach(s -> System.out.println(s));
		
	}
	
	

}
