package com.panda.telcom.FriendsFamily.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.panda.telcom.FriendsFamily.dto.FriendFamilyDTO;
import com.panda.telcom.FriendsFamily.service.FriendFamilyService;

@RestController
@CrossOrigin
public class FriendFamilyController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FriendFamilyService friendService;

	// Create Friend Family
	@PostMapping(value = "/customers/{phoneNo}/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void saveFriend(@PathVariable Long phoneNo, @RequestBody FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
		friendService.saveFriend(phoneNo, friendDTO);
	} 
	
	@GetMapping(value = "/customers/{phoneNo}/friends", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Long> getSpecificFriend(@PathVariable Long phoneNo) {
		logger.info("Get Specific phone request for customer with phone number ", phoneNo);
		return friendService.getSpecificFriends(phoneNo);
	} 
	
	@GetMapping(value="/hiall")
	public String getHi() {
		logger.info("Insode GetHi");
		return "Hi"; 
	}
	

}
