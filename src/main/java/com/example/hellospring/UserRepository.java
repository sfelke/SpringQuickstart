package com.example.hellospring;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository  extends MongoRepository<User, String> {}
