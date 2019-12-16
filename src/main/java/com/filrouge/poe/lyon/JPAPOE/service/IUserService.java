package com.filrouge.poe.lyon.JPAPOE.service;

import java.util.List;

import com.filrouge.poe.lyon.JPAPOE.model.User;

public interface IUserService {
	List<User> allUser();
	void ajouterUser(User t);
	void modifierUser(User t);
	void supprimerUser(User t);
	User findUser(Object t);
}
