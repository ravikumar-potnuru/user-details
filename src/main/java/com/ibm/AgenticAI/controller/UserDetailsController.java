package com.ibm.AgenticAI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.AgenticAI.model.UserDetails;
import com.ibm.AgenticAI.service.UserDetailsService;

import jakarta.websocket.server.PathParam;

@RestController
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@GetMapping("/getbyId/{id}")
	public List<UserDetails> getuserDetailsById(@PathVariable("id") String id){
		List<UserDetails> userDetails = userDetailsService.getUserDetails(id);
		return userDetails;
	}
}
