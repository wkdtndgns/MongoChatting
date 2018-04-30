package net.skhu.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("chat")
public class ChatController {

    @RequestMapping("chat")
    public String list( Model model) {

        return "chat/chat";
    }




}