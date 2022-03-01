package com.blz.GamlerSimulation;

/**
 * Gambler Simulation Game
 */

public class GamblerSimulation {
    public static void main(String[] args) {
        System.out.println("Welcome to Gambler Simulation Game Project");
        // Declaring an initializing variables
        int stake = 100; // Start with a stake every day
        int bet = 1; // Bet for every game
        int money = 0;
        System.out.println("Your stack is"+" "+ 100+"$"+" " + "for every day and Bet of"+" "+ 1+"$ for every game");
        makeBet(stake,bet,money); //Call method to check whether gambler win or loose
    }
    private static void makeBet(int stake, int bet, int money) {
        int choice = (int) ((Math.random()*10)%2); //Generate random number to check win or loose condition
        switch (choice) {
            case 0:
                System.out.println("Gambler win the bet");
                System.out.println(("Amount after winning is = " + (money = stake+(stake/2))));

                break;
            case 1:
                System.out.println("Gambler loose the bet");
                System.out.println(("Amount after loosing is = " + (money = stake-(stake/2))));

                break;
        }
    }
}
