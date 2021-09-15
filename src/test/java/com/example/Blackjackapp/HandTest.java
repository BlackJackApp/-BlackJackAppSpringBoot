package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    @Test
    @DisplayName("add card to hand")
    public void addCardTest(){
        Hand hand = new Hand();
        Card card = new Card(Suit.SPADES,Value.ACE);
        ArrayList<Card> cardArray = new ArrayList<Card>();
        cardArray.add(card);
        hand.addCard(card);
        assertEquals(cardArray,hand.getHand(),"can add cards to hand");
    }

    @Test
    @DisplayName("remove card from hand")
    public void removeCardTest(){
        Hand hand = new Hand();
        Card cardA = new Card(Suit.SPADES,Value.ACE);
        Card cardB = new Card(Suit.SPADES,Value.JACK);
        ArrayList<Card> cardArray = new ArrayList<Card>();
        cardArray.add(cardA); cardArray.add(cardB);
        hand.addCard(cardA); hand.addCard(cardB);
        hand.removeCard(cardB); cardArray.remove(cardB);
        assertEquals(hand.getHand(),cardArray,"you can remove cards");
    }

    @Test
    @DisplayName("set hand")
    public void setHandTest() {
        Hand handA = new Hand(); Card cardA = new Card(Suit.SPADES, Value.ACE);
        Hand handB = new Hand(); Card cardB = new Card(Suit.SPADES, Value.JACK);
        ArrayList<Card> cardArray = new ArrayList<Card>();
        cardArray.add(cardA); cardArray.add(cardB);
        assertEquals(handA, handB, "can add cards to hand");
    }
}
