package fr.lernejo.chat;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ChatMessageController {

    private final ChatMessageRepository repo;

    public ChatMessageController(ChatMessageRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/api/messages")
    public List<String> getMessages() {
        return repo.getLastTenMessages(); // autoconvert list to json
    }
}
