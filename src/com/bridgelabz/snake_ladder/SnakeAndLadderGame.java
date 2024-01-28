package com.bridgelabz.snake_ladder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SnakeAndLadderGame {

    private static final int WINNING_POSITION = 100;
    private static final Map<Integer, Integer> snakesAndLadders = new HashMap<>();

    static {
        // Define snakes and ladders on the board
        snakesAndLadders.put(16, 6);
        snakesAndLadders.put(47, 26);
        snakesAndLadders.put(49, 11);
        snakesAndLadders.put(56, 53);
        snakesAndLadders.put(62, 19);
        snakesAndLadders.put(64, 60);
        snakesAndLadders.put(87, 24);
        snakesAndLadders.put(93, 73);
        snakesAndLadders.put(95, 75);
        snakesAndLadders.put(98, 78);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerPosition = 0;

        System.out.println("Welcome to Snake and Ladder Game!");

        while (playerPosition < WINNING_POSITION) {
            System.out.println("Current Position: " + playerPosition);
            System.out.println("Roll the dice (press Enter)");
            scanner.nextLine();

            int diceRoll = rollDice();
            System.out.println("You rolled a " + diceRoll);

            playerPosition = calculateNewPosition(playerPosition, diceRoll);
