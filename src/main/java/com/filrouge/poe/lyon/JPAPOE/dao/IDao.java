package com.filrouge.poe.lyon.JPAPOE.dao;

import java.util.List;

public interface IDao<T> {
	List<T> all();
	void ajouter(T t);
	void modifier(T t);
	void supprimer(T t);
	T find(Object t);
	List<T> requetenamed(String requete);
	List<T> requetenamed(String requete, Object...tab);
}
