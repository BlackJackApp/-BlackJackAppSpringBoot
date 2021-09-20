package com.example.Blackjackapp;

import java.util.ArrayList;
import java.util.Stack;

public class Game {

    private ArrayList<Player> players = new ArrayList<>();
    private Stack<Card> shuffledDecks;

    public Game(int numberOfPlayers) {
        for (int i = 1; i < numberOfPlayers; i++) {
            players.add(new Player());
        }
        players.add(new Dealer());
        shuffledDecks = Shuffle.shuffle(6);


    }
    // Deals a set number of cards in the game to the Players

    public void deal(int cardsToDeal) {
        for (int i = 0; i < cardsToDeal; i++) {
            for (Player p : players) {
                for (Hand h : p.getHands()) {
                    h.addCard((dealACard()));
                }
            }
        }
    }

    // Deals a single number of Card

    public Card dealACard(){
        return shuffledDecks.pop();
    }

    // Gets the List of Players playing the Game

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    // Gets the Deck currently being played with

    public Stack<Card> getShuffledDecks() {
        return shuffledDecks;
    }

    public void setShuffledDecks(Stack<Card> shuffledDecks) {
        this.shuffledDecks = shuffledDecks;
    }


    public String gameToString() {
        StringBuilder sb = new StringBuilder();
        for (Player p : this.players) {
            sb.append(p.toString());
        }
        return sb.toString();
    }
}

