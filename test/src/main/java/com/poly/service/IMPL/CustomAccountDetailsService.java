package com.poly.service.IMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.poly.dao.AccountRepo;
import com.poly.model.Account;
import com.poly.model.CustomAccountDeails;
import com.poly.service.AccountService;

public class CustomAccountDetailsService implements UserDetailsService{
	
	@Autowired
	private AccountService aService;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Account account = aService.findByUsername(username);
		if(account == null) {
			throw new UsernameNotFoundException("user not found");
		}
		return new CustomAccountDeails(account);
	}
	
}
