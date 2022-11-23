package fr.lernejo.chat;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class Launcher {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(Launcher.class);
        var rabbitTemplate = context.getBean(RabbitTemplate.class);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        while (true) {
            try {

                String mess = myObj.nextLine();  // Read user input
                System.out.println("sending message " + mess);  // Output user input
                if (mess.equals("exist"))
                    break;
                rabbitTemplate.convertAndSend("", "chat_messages", mess); // sending message
            } finally {
                context.close();

            }
        }


    }

//    ChatMessageRepository
}

