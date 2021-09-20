package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class HandTest {
    @Test
    @DisplayName("add card to hand")
    private void addCardTest(){
        Hand hand = new Hand();
        Card card = new Card(Suit.SPADES,Value.ACE);
        ArrayList<Card> cardArray = new ArrayList<Card>();
        cardArray.add(card);
        hand.addCard(card);
        assertEquals(cardArray,hand.getHand(),"can add cards to hand");
    }

    @Test
    @DisplayName("remove card from hand")
    private void removeCardTest(){
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
    @DisplayName("does the hand have the correct value")
    private void assignValueTest(){
        Hand hand = new Hand();
        Card cardA = new Card(Suit.DIAMOND,Value.THREE);
        Card cardB = new Card(Suit.CLUBS,Value.SIX);
        hand.addCard(cardA); hand.addCard(cardB);
        ArrayList actualValue = hand.currentValue();
        ArrayList expectedValue = new ArrayList(); expectedValue.add(9);
        assertEquals(expectedValue,actualValue,"can calculate the value of a given hand");
    }

    @Test
    @DisplayName("does the hand have the correct value (ace)")
    private void assignValueTestAce(){
        Hand hand = new Hand();
        Card cardA = new Card(Suit.DIAMOND,Value.ACE);
        Card cardB = new Card(Suit.CLUBS,Value.SEVEN);
        hand.addCard(cardA); hand.addCard(cardB);
        ArrayList actualValue = hand.currentValue();
        int expectedValue = 18;
        assertEquals(expectedValue, actualValue.get(1),"can calculate the value of a given hand");
    }

    @Test
    @DisplayName("display checks")
    private void stringBuilderChecker(){
        Hand hand = new Hand();
        Card card = new Card(Suit.SPADES,Value.ACE);
        hand.addCard(card);
        String actualAnswer = hand.toString();
        String expectedAnswer = "ACE of SPADES" + System.lineSeparator();
        assertEquals(expectedAnswer,actualAnswer,"string builder works");
    }
}
