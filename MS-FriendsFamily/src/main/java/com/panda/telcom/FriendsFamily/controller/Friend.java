package com.panda.telcom.FriendsFamily.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Friend {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping(value="/hi")
	public String getHi() {
		logger.info("Insode GetHi");
		return "Hi"; 
	}
}
