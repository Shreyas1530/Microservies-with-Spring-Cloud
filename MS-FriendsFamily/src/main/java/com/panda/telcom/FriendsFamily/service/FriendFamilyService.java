package com.panda.telcom.FriendsFamily.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.panda.telcom.FriendsFamily.dto.FriendFamilyDTO;
import com.panda.telcom.FriendsFamily.entity.FriendFamily;
import com.panda.telcom.FriendsFamily.repository.FriendFamilyRepository;

@Service
public class FriendFamilyService {
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	FriendFamilyRepository friendRepo;

	// Create Friend Family
	public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO) {
		logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
		friendDTO.setPhoneNo(phoneNo);
		FriendFamily friend = friendDTO.createFriend();
		friendRepo.save(friend);
	}
	
	public List<Long> getSpecificFriends(Long phoneNo){
		List<Long> friendList = new ArrayList<>();
		List<FriendFamily> friends = friendRepo.findByPhoneNo(phoneNo);
		for(FriendFamily friendFamily : friends)
			friendList.add(friendFamily.getFriendAndFamily());
		return friendList;
	}

}
