/**
 * 
 */
package org.springframework.samples.quickstarter.repository.impl;

import org.springframework.stereotype.Repository;
import org.springframework.samples.quickstarter.model.User;
import org.springframework.samples.quickstarter.repository.UserRepository;
import org.springframework.util.StringUtils;

/**
 * @author AM283065
 *
 */
@Repository
public class UserRepositoryImpl implements UserRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.wipro.quickstarter.repository.UserRepository#getUserDetails()
	 */
	@Override
	public String getUserDetails(User user) {
		// Hit the database
		if (!StringUtils.isEmpty(user.getFirstName())
				&& !StringUtils.isEmpty(user.getLastName())) {
			return user.getFirstName() + " " + user.getLastName();
		} else {
			return "";
		}

	}

}
