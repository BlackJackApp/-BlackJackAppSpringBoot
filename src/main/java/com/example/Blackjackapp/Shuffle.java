package com.example.Blackjackapp;

import com.google.gson.Gson;

import java.util.*;
import java.util.stream.IntStream;

public class Shuffle {

    public static String shuffle(int numberOfDecks) {
        Deck deck = new Deck();
        // Initializes the Number of Decks and adds them on top of each other
        for (int i = 0; i < numberOfDecks; i++) {
            deck.addExtraDeck();
        }
        deck.shuffle();
        String json = new Gson().toJson(deck.getDeck());
        return json;
    }

}
