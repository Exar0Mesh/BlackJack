package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Start the game by prompting the user for the name of each player

        Scanner players = new Scanner(System.in);
        System.out.println("How many players: ");
        int play = players.nextInt();
        players.nextLine();

        int largest = 0;

        for (int i = 1; i < (play+1); i++) { //loop for how many players there is
            System.out.print("What is your name?: ");
            String name = players.nextLine();
            String winning = name;
            //int unName = Integer.parseInt(player);
            Deck deck = new Deck();
            Hand hand = new Hand();

            for (int x = 0; x < 2; x++) {        //2 cards to each hand
                Card card = deck.deal();
                hand.deal(card);
            }

            int handValue = hand.getValue();
            System.out.println(name + " - Your hand is worth " + handValue);
            Math.min(handValue, largest);
            if(handValue > largest) {
                largest = handValue;
            } else if (handValue == largest) {
                System.out.println("There is a tie!");
            }
            System.out.println("\nThe Biggest Number so far is: " + winning + " with " + largest + "\n");
            if (i == (play)) {
                System.out.println("The winner is: " + winning);
            }

        }

    }
}