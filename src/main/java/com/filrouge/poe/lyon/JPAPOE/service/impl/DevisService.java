package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.DevisDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;
import com.filrouge.poe.lyon.JPAPOE.service.IDevisService;

public class DevisService implements IDevisService {

	private IDao devisdao;
	public DevisService(Dao dao) {
		// TODO Auto-generated constructor stub
		super();
		this.devisdao = new DevisDao(dao);
	}
	@Override
	public List<Devis> allDevis() {
		// TODO Auto-generated method stub
		return this.devisdao.all();
	}
	@Override
	public void ajouterDevis(Devis t) {
		// TODO Auto-generated method stub
		this.devisdao.ajouter(t);
	}
	@Override
	public void modifierDevis(Devis t) {
		// TODO Auto-generated method stub
		this.devisdao.modifier(t);
	}
	@Override
	public void supprimerDevis(Devis t) {
		// TODO Auto-generated method stub
		this.devisdao.supprimer(t);
	}
	@Override
	public Devis findDevis(Object t) {
		// TODO Auto-generated method stub
		return (Devis) this.devisdao.find(t);
	}
	@Override
	public List<Devis> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.devisdao.requetenamed(requete);
	}
	@Override
	public List<Devis> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.devisdao.requetenamed(requete, tab);
	}
	@Override
	public Client devisAfficheClient(Object t) {
		// TODO Auto-generated method stub
		return ((Devis)this.devisdao.find(t)).getClient();
	}
	@Override
	public User devisAfficheUser(Object t) {
		// TODO Auto-generated method stub
		return ((Devis)this.devisdao.find(t)).getUser();
	}
	@Override
	public Vehicule devisAfficheVehicule(Object t) {
		// TODO Auto-generated method stub
		return ((Devis)this.devisdao.find(t)).getVehicule();
	}

}
