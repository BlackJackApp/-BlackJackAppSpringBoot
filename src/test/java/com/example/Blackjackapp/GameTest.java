package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class GameTest {

    @Test
    @DisplayName("Correct number of players")
    void numOfPlayers(){
        Game game = new Game(3);
        ArrayList<Player> players = game.getPlayers();
        int playersNum = players.size();
        int expected = 3;
        assertEquals(expected,playersNum,"the correct number of players is set at the start of the game");
    }

    @Test
    @DisplayName("dealing cards to players")
    void dealingCards(){
        Game game = new Game(2);
        game.deal(2);
        ArrayList<Player> players = game.getPlayers();
        Player player = players.get(0);
        ArrayList<Hand> hands = player.getHands();
        Hand hand = hands.get(0);
        int handSize = hands.size();
        int expected = 2;
        assertEquals(expected,handSize,"can deal cards");
    }
}
