package com.mimacom.demo.kubernetes.customerService.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mimacom.demo.kubernetes.customerService.data.entity.UserEntity;

@Repository
public interface UserDAO extends CrudRepository<UserEntity,Long> {
	

}

