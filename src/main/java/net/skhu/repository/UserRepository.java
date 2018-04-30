package net.skhu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.skhu.domain.user;
public interface UserRepository  extends MongoRepository<user, String>{

}
