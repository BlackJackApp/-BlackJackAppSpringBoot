package com.example.Blackjackapp;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    @DisplayName("Define money")
    void createMoneyTest(){
        Player player = new Player();
        player.setMoney(101);
        int expectedMoney = 101;
        assertEquals(expectedMoney,player.getMoney(),"Default money is correct");
    }

    @Test
    @DisplayName("Setting bets")
    void placingBets(){
        Player player = new Player();
        player.setMoney(100);
        player.setPlayerBet(50);
        double expectedBet = 50;
        assertEquals(expectedBet,player.getPlayerBet(),"can place a bet");
    }

    //@Test
    //@DisplayName("Can you place a bet larger than the value a player has access to?")
    //void placingBigBet(){
    //    Player player = new Player();
    //    player.setMoney(100);
    //    player.setPlayerBet(150);
    //    assertSame(false,playerBettingVerification,"You need more money than your current bet");
    //}


    @Test
    @DisplayName("Hand display")
    void displayTest(){
        Player player = new Player();
        Card cardA = new Card(Suit.SPADES,Value.ACE);
        Card cardB = new Card(Suit.HEARTS,Value.QUEEN);
        Hand hand = new Hand();
        hand.addCard(cardA); hand.addCard(cardB);
        assertEquals("ACE of SPADES" + System.lineSeparator() + "QUEEN of HEARTS" + System.lineSeparator(), hand.toString(),"can display the current hand");
    }
}
