package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.VehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IVehiculeService;

public class VehiculeService implements IVehiculeService {

	private IDao vehiculedao;
	
	public VehiculeService(Dao dao) {
		super();
		this.vehiculedao = new VehiculeDao(dao);
	}
	
	@Override
	public List<Vehicule> listeVehicule() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ajouterVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.vehiculedao.ajouter(v);
	}

	@Override
	public void modifierVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.vehiculedao.modifier(v);
	}

	@Override
	public void supprimerVehicule(Vehicule v) {
		// TODO Auto-generated method stub
		this.vehiculedao.supprimer(v);
	}

	@Override
	public Vehicule findVehicule(Integer i) {
		// TODO Auto-generated method stub
		return (Vehicule) this.vehiculedao.find(i);
	}

	@Override
	public List<Vehicule> findAll() {
		// TODO Auto-generated method stub
		return this.vehiculedao.all();
	}

}
