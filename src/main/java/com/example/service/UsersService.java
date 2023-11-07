package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Users;
import com.example.repository.UsersRepository;

@Service
public class UsersService {

	@Autowired
	UsersRepository usersRepository;
	
	public void save(Users users) {
		usersRepository.save(users);
	}
	
	public Users getUsersbyID(int id) {
		return usersRepository.findById(id).get();
	}
	
	public void delete(int id) {
		usersRepository.deleteById(id);
	}
	
	public void update(Users users, int userid) {
		usersRepository.save(userid);
	}
	
}
