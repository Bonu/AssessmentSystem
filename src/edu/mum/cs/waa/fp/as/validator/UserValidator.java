package edu.mum.cs.waa.fp.as.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.mum.cs.waa.fp.as.domain.User;

@Component
public class UserValidator implements Validator {
 

	    @Override
	    public boolean supports(@SuppressWarnings("rawtypes") Class clazz) {
	      return User.class.equals(clazz);
	    }

 
		@Override
		public void validate(Object target, Errors errors) {
		 
			User user = (User) target;
			
		      if(user.getPassword() != null && !user.getPassword().equals(user.getVerifyPassword())
		    		  || user.getVerifyPassword()!=null && !user.getVerifyPassword().equals(user.getPassword())) {
		          errors.rejectValue("password", "UserValidator.Error");
		      }
		}
 
}
