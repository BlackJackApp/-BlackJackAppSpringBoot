package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CardTest {

    @Test
    @DisplayName("Card suit and value assignment")
    public void baseCard(){
        Card someCard = new Card(Suit.SPADES,Value.ACE);
        Suit cardSuit = Suit.SPADES;
        Value cardValue = Value.ACE;
        assertSame(cardSuit,someCard.getSuit(),"The suit is correct");
        assertSame(cardValue,someCard.getValue(),"The value is correct");
    }

    @Test
    @DisplayName("Getters and Setters")
    public void forbiddenTest(){
        Card someCard = new Card(Suit.CLUBS,Value.FOUR);
        someCard.setSuit(Suit.DIAMOND);
        someCard.setValue(Value.EIGHT);
        Suit someCardSuit = someCard.getSuit();
        Value someCardValue = someCard.getValue();
        assertSame(someCardSuit,someCard.getSuit(),"The suit is correct");
        assertSame(someCardValue,someCard.getValue(),"The value is correct");
    }
}
