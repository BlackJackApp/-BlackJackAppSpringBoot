package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Stack;

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

    //@Test
    //@DisplayName("dealing cards to players")
    //void dealingCards(){
    //    Game game = new Game(2);
    //    game.deal(2);
    //    ArrayList<Player> players = game.getPlayers();
    //    Player player = players.get(0);
    //    ArrayList<Hand> hands = player.getHands();
    //    Hand hand = hands.get(0);
    //    //String actual = hand.toString();
    //    //int actual = hand.size();
    //    int expected = 2;
    //    assertEquals(expected,hand,"can deal cards");
    //}

    @Test
    @DisplayName("player joins half way through")
    void addPlayer(){
        Game game = new Game(2);
        ArrayList<Player> originalPlayers = game.getPlayers();
        Player newPlayer = new Player();
        ArrayList<Player> newPlayers = originalPlayers;
        newPlayers.add(newPlayer);
        game.setPlayers(newPlayers);
        int expected = 3;
        ArrayList<Player> actualValue = game.getPlayers();
        int actual = actualValue.size();
        assertEquals(expected,actual,"Can join mid-game");
    }

    @Test
    @DisplayName("Display test")
    void stringGeneratorTest(){
        Game game = new Game(1);
        String actual = game.gameToString();
        String expected = "Dealer In your hand you have Hand 0" + System.lineSeparator() +
                "You are currently scoring: [0]" + System.lineSeparator();
        assertEquals(expected,actual,"String builder works");
    }

    @Test
    @DisplayName("Shuffle getters and setters")
    void forbiddenTest(){
        Game game = new Game(1);
        Stack<Card> deck = Shuffle.shuffle(2);
        game.setShuffledDecks(deck);
        Stack<Card> actual = game.getShuffledDecks();
        assertEquals(deck,actual,"getters and setters");
    }
}
