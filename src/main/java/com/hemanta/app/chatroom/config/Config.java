package com.hemanta.app.chatroom.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class Config implements WebSocketMessageBrokerConfigurer {

  @Override
  public void registerStompEndpoints(@SuppressWarnings("null") StompEndpointRegistry registry) {
    // to connect with server - /server1
    // to send message - /app/message
    // to subscribe so that we can receive messages - /topic/return-to

    registry.addEndpoint("/server1").withSockJS();
  }

  @Override
  public void configureMessageBroker(@SuppressWarnings("null") MessageBrokerRegistry registry) {
    registry.enableSimpleBroker("/topic");
    registry.setApplicationDestinationPrefixes("/app");
  }
}
