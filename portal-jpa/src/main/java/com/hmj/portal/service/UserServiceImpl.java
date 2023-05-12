package com.hmj.portal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hmj.portal.entity.UserEntity;
import com.hmj.portal.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}
	
	@Override
	public UserEntity save(UserEntity userEntity) {
		// TODO Auto-generated method stub
		userRepository.save(userEntity);
		return userEntity;
	}
	
}
