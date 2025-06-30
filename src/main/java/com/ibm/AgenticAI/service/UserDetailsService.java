package com.ibm.AgenticAI.service;

import java.util.List;

import com.ibm.AgenticAI.model.UserDetails;

public interface UserDetailsService {
	public List<UserDetails> getUserDetails(String userId);
	public List<UserDetails> saveUserDetails();
}
