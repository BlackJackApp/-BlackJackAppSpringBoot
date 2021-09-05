package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DeckTest {

    @Test
    @DisplayName("Deck Size to be 52")
    public void noDuplicateCard(){
        Deck deck = new Deck();
        int max = 52;
        assertSame(max, deck.getDeck().size(), "This is to test a deck has 52 cards");
    }
}
