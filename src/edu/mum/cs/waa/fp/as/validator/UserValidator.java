package edu.mum.cs.waa.fp.as.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import edu.mum.cs.waa.fp.as.domain.User;
/**
 * 
 * @author Michael
 * This class is responsible for custom validation of domain object. 
 * It compares password and verify password to make sure the user entered them correctly
 */
@Component
public class UserValidator implements Validator {
 
		/**
		 * checks if this data type is supported by the validator
		 * @param clazz represents the class type to be checked for support.
		 * @return boolean determining whether 
		 */
	    @Override
	    public boolean supports(@SuppressWarnings("rawtypes") Class clazz) {
	      return User.class.equals(clazz);
	    }

	    /**
	     * check the target object for errors which are in this case password and verify
	     * password not equal
	     * @param target the target object to be checked for errors.
	     * @param errors the object responsible for holding a list of errors
	     */
		@Override
		public void validate(Object target, Errors errors) {
		 
			User user = (User) target;
			
		      if(user.getPassword() != null && !user.getPassword().equals(user.getVerifyPassword())
		    		  || user.getVerifyPassword()!=null && !user.getVerifyPassword().equals(user.getPassword())) {
		          errors.rejectValue("password", "UserValidator.Error");
		      }
		}
 
}
