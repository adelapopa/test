package com.timbuchalka;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // creez un obiect pe nume scan din clasa Scanner. In acelasi timp se apeleaza constructorul System.in ceea ce inseamna ca se citeste inputurile de la consola
		System.out.println("Bine ai venit la X-O!");
		MainMethods methods = new MainMethods(); // crearea obiectului methods din clasa MainMethods(instanta a clasei MainMethods)

		do{
			char[][] matrix = methods.getMatrix();
			int row;
			int col;
			if(methods.getCurrentPlayer() == 'x'){ // daca jucatorul este x
				do {
					System.out.println(methods.getCurrentPlayer() + " introduce o valoare"); // afisarea mesaj ca x introduce o valoare
					 row = scan.nextInt(); // se cere de la tastura valoare pentru rand
					 col = scan.nextInt(); // se cere de la tastatura valoare pentru coloana
				} while(matrix[row][col] != '@');
				methods.checkBox(row, col);
			} else {
				System.out.println(methods.getCurrentPlayer() + " introduce o valoare aleatorie");
				do {
					Random rand = new Random();
					row = rand.nextInt(3);
					col = rand.nextInt(3);
				} while(matrix[row][col] != '@');
				methods.checkBox(row, col);
			}
			System.out.println("starea tabelei de joc este: ");
			methods.printBlackBoard();
			methods.changePlayer();
		}while(!methods.winnerOfTheGame() && !methods.boardFull());

		if(!methods.winnerOfTheGame() && methods.boardFull()) {
			System.out.println("remiza");
		} else {
			methods.changePlayer();
			System.out.println(methods.getCurrentPlayer() + " a castigat");
		}
    }
}
