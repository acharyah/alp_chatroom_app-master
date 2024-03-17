package com.hemanta.app.chatroom.controllers;

import com.hemanta.app.chatroom.models.Message;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @MessageMapping("/message")
  @SendTo("/topic/return-to")
  public Message getContent(@RequestBody Message message) {

    try {
      // processing
      // save messages to database
      Thread.sleep(1000);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return message;
  }

}
