package com.example.Blackjackapp;

import java.util.ArrayList;
import java.util.Collections;

public class Player extends Person {
    private ArrayList<Hand> hands = new ArrayList<>();
    private int playerBet;
    private double Money;

    public Player() {
        this("Arkaan");
    }

    public Player(String name) {
        this(name, 100);
    }

    // Creates a player with name and Its Money

    public Player(String name, double Money) {
        this.setName(name);
        this.setMoney(Money);
        hands.add(new Hand());
    }

    /* Splits the Hand in two if the Cards are Same Value
    public void split(Hand hand,Card c, Card d){
        Hand splitHand = new Hand();
        splitHand.addCard(hand.getHand().get(1));
        hand.removeCard(hand.getHand().get(1));
        hand.addCard(c);
        splitHand.addCard(d);
        this.hands.add(splitHand);
    }
    */

    public int getPlayerBet() {
        return playerBet;
    }

    public void setPlayerBet(int playerBet) {
        this.playerBet = playerBet;
    }

    public double getMoney() {
        return Money;
    }

    public void setMoney(double money) {
        this.Money = money;
    }

    public ArrayList<Hand> getHands() {
        return hands;
    }

    public void setHands(ArrayList<Hand> hands) {
        this.hands = hands;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName() + " In your hand you have ");
        for (Hand h : hands) {
            sb.append("Hand " + hands.indexOf(h) + System.lineSeparator());
            sb.append(h);
            if (h.currentValue().get(h.currentValue().indexOf(Collections.min(h.currentValue()))) < 22) {
                sb.append("You are currently scoring: " + h.currentValue() + System.lineSeparator());
            }
        }
        return sb.toString();
    }
}


