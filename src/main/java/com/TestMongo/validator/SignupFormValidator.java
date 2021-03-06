package com.TestMongo.validator;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import com.TestMongo.dto.SignupForm;
import com.TestMongo.entities.Users;
import com.TestMongo.repositories.UserRepository;

@Component
public class SignupFormValidator extends LocalValidatorFactoryBean {
	
	private UserRepository userRepository;

	
	@Resource
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	
	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(SignupForm.class);
	}

	@Override
	public void validate(Object obj, Errors errors, final Object... validationHints) {
		
		super.validate(obj, errors, validationHints);
		
		if (!errors.hasErrors()) {
			SignupForm signupForm = (SignupForm) obj;
			Users user = userRepository.findByEmail(signupForm.getEmail());
			if (user != null)
				errors.rejectValue("email", "emailNotUnique");			
		}
		
	}


}
