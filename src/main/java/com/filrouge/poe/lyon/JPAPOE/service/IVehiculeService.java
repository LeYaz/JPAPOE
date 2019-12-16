package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.Vehicule;

public interface IVehiculeService {
	List<Vehicule> listeVehicule();
	void ajouterVehicule(Vehicule v);
	void modifierVehicule(Vehicule v);
	void supprimerVehicule(Vehicule v);
	Vehicule findVehicule(Integer i);
	List<Vehicule> findAll();
}
