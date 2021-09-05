package com.example.Blackjackapp;

import java.util.Collections;
import java.util.Stack;

public class Deck {

    private Stack<Card> deck = new Stack();

    // Creates a public class to create a deck
    public Deck() {this.deckInitializer();}

    // Creates New Deck of Cards

    private void deckInitializer(){
        Suit currentSuit= Suit.SPADES;
        Value thisValue= Value.ACE;
        for(Suit cardSuit : Suit.values()) {
            for (Value cardValue : Value.values()) {
                this.deck.add(new Card(cardSuit, cardValue));
            }
        }
    }

    // Getters and setters
    public Stack<Card> getDeck() {
        return deck;
    }

    public void setDeck(Stack<Card> deck) {
        this.deck = deck;
    }


    // Adds Extra Deck

    public void addExtraDeck(){
        this.deck.addAll(new Deck().getDeck());
    }


    // Removes Number of Cards

    public void removeCardFromDeck(int index){
        this.deck.remove(index);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }
}


