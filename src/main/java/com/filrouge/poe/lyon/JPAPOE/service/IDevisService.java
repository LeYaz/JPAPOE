package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.Client;
import com.filrouge.poe.lyon.JPAPOE.model.Devis;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public interface IDevisService {

	List<Devis> allDevis();
	void ajouterDevis(Devis t);
	void modifierDevis(Devis t);
	void supprimerDevis(Devis t);
	Devis findDevis(Object t);
	List<Devis> requetenamed(String requete);
	List<Devis> requetenamed(String requete, Object...tab);
	Client devisAfficheClient(Object t);
	User devisAfficheUser(Object t);
	Vehicule devisAfficheVehicule(Object t);
}
