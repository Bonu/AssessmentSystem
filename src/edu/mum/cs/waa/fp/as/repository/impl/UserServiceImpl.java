package edu.mum.cs.waa.fp.as.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.waa.fp.as.domain.User;
import edu.mum.cs.waa.fp.as.repository.UserRepository;
import edu.mum.cs.waa.fp.as.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository rep;
	@Override
	public void save(User user) {
		rep.save(user);
	}

}
