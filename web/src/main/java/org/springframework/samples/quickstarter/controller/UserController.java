/**
 * 
 */
package org.springframework.samples.quickstarter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.quickstarter.model.User;
import org.springframework.samples.quickstarter.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author AM283065
 *
 */
@Controller
public class UserController {
	/**
	 * Global variables
	 */
	private static final String HOME_PAGE = "home";

	/**
	 * Service wiring
	 */
	@Autowired
	UserService userService;

	/**
	 * Home page rout
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/")
	public String loadHomePage(@ModelAttribute User user) {
		return HOME_PAGE;
	}

	/**
	 * Submit form route
	 * 
	 * @param user
	 * @param m
	 * @return
	 */
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute User user, Model m) {
		m.addAttribute("userData", userService.getUserDetails(user));
		return HOME_PAGE;
	}

}
