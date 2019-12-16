package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public class VehiculeDao extends EntityDao<Vehicule> implements IDao<Vehicule> {

	public VehiculeDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Vehicule> all() {
		// TODO Auto-generated method stub
		return this.findAll(Vehicule.class);
	}

	@Override
	public void ajouter(Vehicule t) {
		// TODO Auto-generated method stub
		this.add(t);
	}

	@Override
	public void modifier(Vehicule t) {
		// TODO Auto-generated method stub
		this.update(t);
	}

	@Override
	public void supprimer(Vehicule t) {
		// TODO Auto-generated method stub
		this.remove(Vehicule.class,t.getId());
	}

	@Override
	public Vehicule find(Object t) {
		// TODO Auto-generated method stub
		return this.find(Vehicule.class, t);
	}

	@Override
	public List<Vehicule> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Vehicule.class, requete);
	}

	@Override
	public List<Vehicule> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Vehicule.class, requete, tab);
	}

}
