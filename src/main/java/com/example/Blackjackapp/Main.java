package com.example.Blackjackapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Game game = new Game(5);
        game.deal(2);
        System.out.println(game.gameToString());

        playTurn(game,0,0);
        playTurn(game,1,0);
        }






    public static void playTurn(Game g,int player, int hand) {
        System.out.println("Player " + g.getPlayers().get(player).getName() + System.lineSeparator() + "You are currently scoring:" +
                g.getPlayers().get(player).getHands().get(hand).currentValue());

        // HIT OR STAY

        while (g.getPlayers().get(player).getHands().get(hand).currentValue().get(0) < 21) {
            System.out.println("Would you like to HIT or STAY?");
            Scanner scan = new Scanner(System.in);
            boolean validInput = false;
            String input;
            do {
                input = scan.next().toUpperCase();
                if (input.equals("HIT") || input.equals("STAY")) {
                    validInput = true;
                }
            } while (!validInput);
            if (input.equals("HIT")) {
                g.getPlayers().get(player).getHands().get(hand).addCard(g.dealACard());
                System.out.println("Player " + g.getPlayers().get(player).getName() + System.lineSeparator() + "You are currently scoring:" +
                        g.getPlayers().get(player).getHands().get(hand).currentValue());
            }
            else if(input.equals("STAY")){
                System.out.println("Player " + g.getPlayers().get(player).getName() + " has decided to stay");
                break;
            }
        }
    }


}
