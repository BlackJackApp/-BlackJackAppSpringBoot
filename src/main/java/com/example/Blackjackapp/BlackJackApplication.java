package com.example.Blackjackapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BlackJackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlackJackApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("Initial State")
	public String newResponse(){
		Player player = new Player();
		return player.getName();
	}
}
