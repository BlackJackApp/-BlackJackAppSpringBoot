package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShuffleTest {

    @Test
    @DisplayName("Deck Shuffle")
    void basicShuffleTest(){
        Deck deck = new Deck();
        deck.addExtraDeck(); deck.addExtraDeck(); deck.addExtraDeck(); deck.addExtraDeck();
        String expectedDeck = Shuffle.shuffle(5);
        String deckString = deck.toString();
        assertEquals(deckString,expectedDeck,"Shuffle function works");
    }

}
