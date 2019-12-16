package com.filrouge.poe.lyon.JPAPOE.service.impl;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.dao.IDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.Dao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.UserDao;
import com.filrouge.poe.lyon.JPAPOE.dao.impl.VehiculeDao;
import com.filrouge.poe.lyon.JPAPOE.model.User;
import com.filrouge.poe.lyon.JPAPOE.service.IUserService;

public class UserService implements IUserService {

private IDao userdao;
	
	public UserService(Dao dao) {
		super();
		this.userdao = new UserDao(dao);
	}
	
	@Override
	public List<User> allUser() {
		// TODO Auto-generated method stub
		return this.userdao.all();
	}

	@Override
	public void ajouterUser(User t) {
		// TODO Auto-generated method stub
		this.userdao.ajouter(t);
	}

	@Override
	public void modifierUser(User t) {
		// TODO Auto-generated method stub
		this.userdao.modifier(t);
	}

	@Override
	public void supprimerUser(User t) {
		// TODO Auto-generated method stub
		this.userdao.supprimer(t);
	}

	@Override
	public User findUser(Object t) {
		// TODO Auto-generated method stub
		return (User) this.userdao.find(t);
	}

}
