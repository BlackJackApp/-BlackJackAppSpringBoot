package com.example.Blackjackapp;

public class Card {
    private Suit suit;
    private Value value;



    // Sets the Card with Value and Suit
    public Card(Suit suit, Value value){
        this.suit= suit;
        this.value= value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    // Gets the Card Value
    public Value getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value +
                " of " + suit;
    }
}
