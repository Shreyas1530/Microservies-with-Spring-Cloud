package com.panda.telcom.FriendsFamily.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.panda.telcom.FriendsFamily.entity.FriendFamily;

public interface FriendFamilyRepository extends JpaRepository<FriendFamily, Integer> {

	List<FriendFamily> findByPhoneNo(long phoneNo);
}
