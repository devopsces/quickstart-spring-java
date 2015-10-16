/**
 * 
 */
package org.springframework.samples.quickstarter.repository;

import org.springframework.samples.quickstarter.model.User;

/**
 * @author AM283065
 *
 */
public interface UserRepository {
	
	public String getUserDetails(User user);

}
