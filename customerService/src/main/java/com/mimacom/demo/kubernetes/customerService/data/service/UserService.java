package com.mimacom.demo.kubernetes.customerService.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mimacom.demo.kubernetes.customerService.data.entity.UserEntity;
import com.mimacom.demo.kubernetes.customerService.data.repository.UserDAO;

/**
 * Created by adbe on 13/09/2017.
 */
@Service
public class UserService {

	@Autowired UserDAO userDAO;

	public Iterable<UserEntity> getUserList(){

			return  userDAO.findAll();
	}
}
