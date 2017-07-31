package com.TestMongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.TestMongo.entities.Users;



public interface UserRepository extends MongoRepository<Users, String>{

	Users findByEmail(String email);

}
