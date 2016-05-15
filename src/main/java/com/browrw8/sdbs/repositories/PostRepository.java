package com.browrw8.sdbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.browrw8.sdbs.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
