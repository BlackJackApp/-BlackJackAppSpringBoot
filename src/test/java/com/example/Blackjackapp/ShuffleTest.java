package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class ShuffleTest {

    @Test
    @DisplayName("Deck Shuffle")
    void basicShuffleTest(){
        Deck deck = new Deck();
        deck.addExtraDeck(); deck.addExtraDeck();
        Stack expectedDeck = Shuffle.shuffle(3);
        assertNotEquals(expectedDeck,Shuffle.shuffle(3),"Shuffle function works");
    }

}
