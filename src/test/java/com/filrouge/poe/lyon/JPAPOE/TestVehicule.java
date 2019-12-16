package com.filrouge.poe.lyon.JPAPOE;

import java.util.Date;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IVehiculeService;
import com.filrouge.poe.lyon.JPAPOE.service.impl.VehiculeService;

public class TestVehicule {

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
	public void testFindAllVehicule() {
		IVehiculeService vehiculeservice =  new VehiculeService(dao);
		List<Vehicule> vl=vehiculeservice.findAll();
		vl.forEach(v -> System.out.println(v));
	}
	
	@Test
	public void testFindVehicule() {
		IVehiculeService vehiculeservice =  new VehiculeService(dao);
		Vehicule vl=vehiculeservice.findVehicule(1);
		System.out.println(vl);
	}
	
//	@Test
//	public void testAddVehicule() {
//		IVehiculeService vehiculeservice =  new VehiculeService(dao);
//		Vehicule vl = new Vehicule();
//		vl.setDatecreation(new Date());
//		vl.setModele("C1");
//		vl.setQuantite(3);
//		vl.setPrixht(9855.0f);
//		vehiculeservice.ajouterVehicule(vl);
//		this.testFindAllVehicule();
//		
//	}
	
	@Test
	public void testSupprimerVehicule() {
		IVehiculeService vehiculeservice =  new VehiculeService(dao);
		Vehicule vl = new Vehicule();
		vl.setDatecreation(new Date());
		vl.setModele("C1");
		vl.setQuantite(3);
		vl.setPrixht(9855.0f);
		vehiculeservice.ajouterVehicule(vl);
		this.testFindAllVehicule();
		vehiculeservice.supprimerVehicule(vl);
		
	}
	
	@Test
	public void testUpdateVehicule() {
		IVehiculeService vehiculeservice =  new VehiculeService(dao);
		Vehicule vl=vehiculeservice.findVehicule(4);
		vl.setPrixht(vl.getPrixht()+5);
		vehiculeservice.modifierVehicule(vl);
	}

}
