package net.skhu.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import net.skhu.domain.chat;

public interface ChatRepository  extends MongoRepository<chat, String>{

}
