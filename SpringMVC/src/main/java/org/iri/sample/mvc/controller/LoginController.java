package org.iri.sample.mvc.controller;

import java.util.Set;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	final  Logger logger = Logger.getLogger(getClass());
	private Set<String> roles;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome() {
//	public String printWelcome(ModelMap model, Principal principal) {

//		roles = AuthorityUtils.authorityListToSet(SecurityContextHolder
//				.getContext().getAuthentication().getAuthorities());
//		if (roles.contains("ROLE_USER")) {
//			String name = principal.getName();
//			model.addAttribute("username", name);
//			model.addAttribute("role", roles);
//			model.addAttribute("message", "IRI Security");
//			return "hello";
//		} else if (roles.contains("ROLE_ADMIN")) {
//			String name = principal.getName();
//			model.addAttribute("username", name);
//			model.addAttribute("role", roles);
//			model.addAttribute("message", "IRI Security");
//			return "hello";
//		} else {
//			String name = principal.getName();
//			model.addAttribute("username", name);
//			model.addAttribute("role", "No Roles Assigned");
//			model.addAttribute("message", "IRI Security");
//			return "hello";
//		}
		
		return "welcome";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
		
		logger.info("Into Login controller ");
		return "login";

	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
		logger.error("Login falled");
		model.addAttribute("error", "true");
		return "login";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {

		return "login";

	}

	@RequestMapping(value = "/sessionexpired", method = RequestMethod.GET)
	public String sessionexpired(ModelMap model) {
		logger.debug(" Session Expired ");
		return "session";

	}
}
