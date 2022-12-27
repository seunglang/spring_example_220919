package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.UserDAO;

@Service
public class UserBO {
	
	@Autowired
	UserDAO userDAO;
	
	public void adduser(String name, String yyyymmdd, String email, String introduce) {
		userDAO.insertuser(name, yyyymmdd, email, introduce);
	}
}
