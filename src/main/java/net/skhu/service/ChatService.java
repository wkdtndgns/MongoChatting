package net.skhu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.domain.chat;
import net.skhu.repository.ChatRepository;


@Service
public class ChatService {

	@Autowired ChatRepository chatRepository;

	public void save(chat chat) {


		 chatRepository.save(chat);
	}

}
