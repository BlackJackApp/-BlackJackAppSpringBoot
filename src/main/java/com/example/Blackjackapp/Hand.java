package com.example.Blackjackapp;

import java.util.ArrayList;

public class Hand {

    private ArrayList<Card> hand = new ArrayList<>();

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void addCard(Card c){
        this.hand.add(c);
    }

    public void removeCard(Card c){
        this.hand.remove(c);
    }


    // Specific to BlackJack Values / Score Calculator

    public ArrayList<Integer> currentValue(){
        ArrayList<Integer> values = new ArrayList<>();
        int score = 0;
        boolean isAce = false;
        for(Card c: hand){
            if(c.getValue()==Value.ACE){
                isAce=true;
            }
            score += c.getValue().getValue();
        }
        values.add(score);
        if(isAce){
            values.add(score+11);
        }
        return values;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Card c:hand){
            sb.append((c + System.lineSeparator()));
        }
        return sb.toString();
    }
}