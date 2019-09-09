package com.company;

public class Main {

    public static void main(String[] args) { // method main

    	boolean gameOver = true;
    	int score = 800;
    	int levelCompleted = 5;
    	int bonus = 100;

		calculateScore(gameOver, score, levelCompleted, bonus);

		score = 10000;
		levelCompleted = 8;
		bonus = 200;
		calculateScore(gameOver, score, levelCompleted ,  bonus);

		calculateScore(true, 500, 2, 300);

		}

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

		if (gameOver) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println("your final score was: " + finalScore);
			return finalScore;
		}
			return -1;
		
	}
}
