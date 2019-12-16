package com.filrouge.poe.lyon.JPAPOE.dao.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;

public class UserDao extends EntityDao<User> implements IDao<User> {

	public UserDao(Dao dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<User> all() {
		// TODO Auto-generated method stub
		return this.findAll(User.class);
	}

	@Override
	public void ajouter(User t) {
		// TODO Auto-generated method stub
		this.add(t);
	}

	@Override
	public void modifier(User t) {
		// TODO Auto-generated method stub
		this.update(t);
	}

	@Override
	public void supprimer(User t) {
		// TODO Auto-generated method stub
		this.remove(User.class,t.getId());
	}

	@Override
	public User find(Object t) {
		// TODO Auto-generated method stub
		return this.find(User.class, t);
	}

	@Override
	public List<User> requetenamed(String requete) {
		// TODO Auto-generated method stub
		return this.requeteNamed(User.class, requete);
	}

	@Override
	public List<User> requetenamed(String requete, Object... tab) {
		// TODO Auto-generated method stub
		return this.requeteNamed(User.class, requete, tab);
	}

}
