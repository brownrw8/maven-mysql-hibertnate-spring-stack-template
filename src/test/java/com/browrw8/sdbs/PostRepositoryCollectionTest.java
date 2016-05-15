package com.browrw8.sdbs;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.browrw8.sdbs.entities.Post;
import java.util.List;
import com.browrw8.sdbs.repositories.PostRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/application-context.xml")
public class PostRepositoryCollectionTest {

	@Autowired
	PostRepository repository;
	
	@Test
	public void test() {
		Post post = new Post();
		post.setPostDate(new Date());
		post.setTitle("Another Post");
		
		repository.save(post);
		
		List<Post> dbposts = repository.findAll();
		assertFalse(dbposts.isEmpty());
                for(Post dbpost : dbposts){
                    System.out.println(dbpost.getTitle());   
                }
	}
}
