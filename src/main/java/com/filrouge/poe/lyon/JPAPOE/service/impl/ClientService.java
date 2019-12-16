package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.ClientDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.service.IClientService;

public class ClientService implements IClientService {
	private IClientDao clientdao;
	
	public ClientService(Dao dao) {
		super();
		this.clientdao = new ClientDao(dao);
	}
	
	public List<Client> listeClients() {
		// TODO Auto-generated method stub
		return null;
	}

	public void ajouterClient(Client c) {
		// TODO Auto-generated method stub
		clientdao.ajouterClient(c);
	}

	public void modifierClient(Client c) {
		// TODO Auto-generated method stub
		clientdao.modifierClient(c);
	}

	public void supprimerClient(Client c) {
		// TODO Auto-generated method stub
		clientdao.supprimerClient(c);
	}

	public Client findClient(Integer i) {
		// TODO Auto-generated method stub
		return clientdao.findClient(i);
	}

	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return clientdao.findAll();
	}

	@Override
	public List<Client> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.clientdao.requetenamed(requete);
	}

	@Override
	public List<Client> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.clientdao.requetenamed(requete, tab);
	}

	@Override
	public List<Devis> findDevisByClient(Integer i) {
		// TODO Auto-generated method stub
		return this.clientdao.findClient(i).getListedevis();
	}

}
