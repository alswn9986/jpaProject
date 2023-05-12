package com.hmj.portal.service;

import java.util.List;

import com.hmj.portal.entity.UserEntity;

public interface UserService {
	
	List<UserEntity> findAll();
	UserEntity save(UserEntity userEntity);
	
}
