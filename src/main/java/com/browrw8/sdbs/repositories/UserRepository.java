package com.browrw8.sdbs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.browrw8.sdbs.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
