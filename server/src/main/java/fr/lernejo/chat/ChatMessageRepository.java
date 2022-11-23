package fr.lernejo.chat;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChatMessageRepository {
    final List<String> Messages;
    public ChatMessageRepository() {
        this.Messages = new ArrayList<String>();
    }

    void addChatMessage(String message) {
        Messages.add(message);
        if(Messages.size()>10)
            Messages.remove(0);
    }

    List<String> getLastTenMessages() {
        return Messages;
    }
}
