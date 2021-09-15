package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    @DisplayName("Deck Size to be 52")
    public void deckSize(){
        Deck deck = new Deck();
        int max = 52;
        assertSame(max, deck.getDeck().size(), "This is to test a deck has 52 cards");
    }

    @Test
    @DisplayName("52 unique cards")
    public void noDuplicatedSuits() {
        Deck deck = new Deck();

        int spadesCounter = 0; int heartsCounter = 0; int clubsCounter = 0; int diamondsCounter = 0;

        for (Card card : deck.getDeck()) {
            if (card.getSuit() == Suit.SPADES) {
                spadesCounter++;
            } else if (card.getSuit() == Suit.HEARTS) {
                heartsCounter++;
            } else if (card.getSuit() == Suit.CLUBS) {
                clubsCounter++;
            } else if (card.getSuit() == Suit.DIAMOND) {
                diamondsCounter++;
            }
        }

        assertEquals(13, spadesCounter, "correct number of spades");
        assertEquals(13, clubsCounter, "correct number of clubs");
        assertEquals(13, heartsCounter, "correct number of hearts");
        assertEquals(13, diamondsCounter, "correct number of diamonds");
    }

    @Test
    @DisplayName("52 unique cards")
    public void noDuplicatedValues() {
        Deck deck = new Deck();

        int aceCounter = 0; int twoCounter = 0; int threeCounter = 0; int fourCounter = 0; int fiveCounter = 0;
        int sixCounter = 0; int sevenCounter = 0; int eightCounter = 0; int nineCounter = 0; int tenCounter = 0;
        int jackCounter = 0; int queenCounter = 0; int kingCounter = 0;

        for(Card card: deck.getDeck()){
            if(card.getValue() == Value.ACE){
               aceCounter++;
            }
            else if(card.getValue() == Value.TWO){
                twoCounter++;
            }
            else if(card.getValue() == Value.THREE){
                threeCounter++;
            }
            else if(card.getValue() == Value.FOUR){
                fourCounter++;
            }
            else if(card.getValue() == Value.FIVE){
                fiveCounter++;
            }
            else if(card.getValue() == Value.SIX){
                sixCounter++;
            }
            else if(card.getValue() == Value.SEVEN){
                sevenCounter++;
            }
            else if(card.getValue() == Value.EIGHT){
                eightCounter++;
            }
            else if(card.getValue() == Value.NINE){
                nineCounter++;
            }
            else if(card.getValue() == Value.TEN){
                tenCounter++;
            }
            else if(card.getValue() == Value.JACK){
                jackCounter++;
            }
            else if(card.getValue() == Value.QUEEN){
                queenCounter++;
            }
            else if(card.getValue() == Value.KING){
                kingCounter++;
            }
        }
        assertEquals(4, aceCounter,"correct number 1"); assertEquals(4, twoCounter,"correct number 2");
        assertEquals(4, threeCounter,"correct number 3"); assertEquals(4, fourCounter,"correct number 4");
        assertEquals(4, fiveCounter,"correct number 5"); assertEquals(4, sixCounter,"correct number 6");
        assertEquals(4, sevenCounter,"correct number 7"); assertEquals(4, eightCounter,"correct number 8");
        assertEquals(4, nineCounter,"correct number 9"); assertEquals(4, tenCounter,"correct number 10");
        assertEquals(4, jackCounter,"correct number 11"); assertEquals(4, queenCounter,"correct number 12");
        assertEquals(4, kingCounter,"correct number 13");
    }

    @Test
    @DisplayName("Deck adder")
    public void deckAdder(){
        Deck deck = new Deck();
        deck.addExtraDeck();
        int total = 104;
        assertSame(total, deck.getDeck().size(), "There are 2 decks in play");
    }

    @Test
    @DisplayName("Card remover")
    public void cardRemover(){
        Deck deck = new Deck();
        deck.removeCardFromDeck(1);
        int total = 51;
        assertSame(total, deck.getDeck().size(), "You can remove a card");
    }

    @Test
    @DisplayName("Shuffler")
    public void shuffleDeckTest(){
        Deck deckA = new Deck();
        Deck deckB = new Deck();
        deckA.shuffle();
        deckB.shuffle();
        assertNotEquals(deckA,deckB,"The decks are shuffled");
    }
}
