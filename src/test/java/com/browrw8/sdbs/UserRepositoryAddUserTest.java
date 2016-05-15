package com.browrw8.sdbs;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.browrw8.sdbs.entities.User;
import java.util.List;
import com.browrw8.sdbs.repositories.UserRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class UserRepositoryAddUserTest {

	@Autowired
	UserRepository repository;
	
	@Test
	public void test() {
		User user = new User();
		user.setFirstname("Testy");
		user.setLastname("McTestface");
		
		repository.save(user);
		
		User dbuser = repository.findOne(user.getUserId());
		assertNotNull(dbuser.getUserId());
	}
}
