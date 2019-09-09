package com.company;

public class Main {

	public static void main(String[] args) {
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;

//		if (score < 5000 && score > 1000) {
//			System.out.println("your score was less 5000 but greater than 1000 ");
//			//System.out.println("this was executed");
//		} else if(score < 1000){
//			System.out.println("your score is less than 1000");
//		}
//		else {
//			System.out.println("got here");
//		}

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus); // 800 + 500 = 1300
			finalScore += 1000;
			System.out.println("your final score was: " + finalScore);
		}


		//CHALLENGE
//		boolean newGameOver = true;
//		int newScore = 10000;
//		int newLevelCompleted = 8;
//		int newBonus = 200;
//
//		if(newGameOver){
//			int finalScore = newScore + (newLevelCompleted * newBonus);
//			System.out.println("your final score was: " + finalScore);
//		}

		score = 10000;
		levelCompleted = 8;
		bonus = 200;

		if(gameOver) {
			int finalScore = score + (levelCompleted * bonus); // 10000+1600 = 11600
			System.out.println("your final score was: " + finalScore);
		}
	}
}