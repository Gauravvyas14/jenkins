package com.TestMongo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.TestMongo.dto.SignupForm;
import com.TestMongo.dto.UserDetailsImpl;
import com.TestMongo.entities.Users;
import com.TestMongo.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public void signupUser(SignupForm signupForm) {
		
		Users user=new Users();
		user.setEmail(signupForm.getEmail());
		user.setName(signupForm.getName());
		user.setPassword(signupForm.getPassword());
		
		
		userRepo.save(user);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = userRepo.findByEmail(username);
		if (user == null)
			throw new UsernameNotFoundException(username);

		return new UserDetailsImpl(user);

	}

}
