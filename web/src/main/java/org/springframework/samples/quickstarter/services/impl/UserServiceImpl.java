/**
 * 
 */
package org.springframework.samples.quickstarter.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.samples.quickstarter.model.User;
import org.springframework.samples.quickstarter.repository.UserRepository;
import org.springframework.samples.quickstarter.services.UserService;

/**
 * @author AM283065
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wipro.quickstarter.services.UserService#getUserDetails()
	 */
	@Override
	public String getUserDetails(User user) {
		// TODO Auto-generated method stub
		return userRepository.getUserDetails(user);
	}

}
