package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;

public class ClientDao extends EntityDao<Client> implements IClientDao {

	public ClientDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		this.add(c);
	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub
		this.update(c);
	}

	public void supprimerClient(Client c) {
		// TODO Auto-generated method stub
		this.remove(Client.class,c.getId());
	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return this.find(Client.class, i);
	}

	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return this.findAll(Client.class);
	}

	@Override
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Client.class, requete);
	}

	@Override
	public List<Client> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(Client.class, requete, tab);
	}

	
}
