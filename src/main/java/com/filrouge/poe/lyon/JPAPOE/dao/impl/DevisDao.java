package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;

public class DevisDao extends EntityDao<Devis> implements IDao<Devis> {

	public DevisDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Devis> all() {
		// TODO Auto-generated method stub
		return this.findAll(Devis.class);
	}

	@Override
	public void ajouter(Devis t) {
		// TODO Auto-generated method stub
		this.add(t);
	}

	@Override
	public void modifier(Devis t) {
		// TODO Auto-generated method stub
		this.update(t);
	}

	@Override
	public void supprimer(Devis t) {
		// TODO Auto-generated method stub
		this.remove(Devis.class, t.getId());
	}

	@Override
	public Devis find(Object t) {
		// TODO Auto-generated method stub
		return (Devis) this.find(Devis.class, t);
	}

	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Devis.class, requete);
	}

	@Override
	public List<Devis> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Devis.class, requete, tab);
	}

}
