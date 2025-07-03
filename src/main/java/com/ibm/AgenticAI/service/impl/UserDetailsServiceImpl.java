package com.ibm.AgenticAI.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ibm.AgenticAI.model.UserDetails;
import com.ibm.AgenticAI.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public List<UserDetails> getUserDetails(String userId) {
		List<UserDetails> userDetails = new ArrayList<UserDetails>();
		UserDetails userDetail = new UserDetails();
		userDetail.setUserId("123");
		userDetail.setUserName("ravi");
		userDetail.setPassword("123123");
		userDetail.setUserAddress("Hyd");
		UserDetails userDetail1 = new UserDetails();
		userDetail1.setUserId("456");
		userDetail1.setUserName("kumar");
		userDetail.setPassword("123123");
		userDetail1.setUserAddress("Banglore");
		userDetails.add(userDetail);
		userDetails.add(userDetail1);
		System.out.println("userDetails : " + userDetails);
		return userDetails.stream()
				.filter(ud -> userId.equalsIgnoreCase(ud.getUserId()))
				.collect(Collectors.toList());
	}

	@Override
	public List<UserDetails> saveUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
