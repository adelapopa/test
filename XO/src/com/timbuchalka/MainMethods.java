package com.timbuchalka;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class MainMethods {
    private char[][] matrix;
    private char currentPlayer;

    public MainMethods() {
        matrix = new char[3][3]; // declarare matrice de 3x3
        currentPlayer = 'x'; // setare jucator curent(x va incepe prima data)
        initializeBlackBoard();
    }
    public char[][] getMatrix() {
        return matrix;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void initializeBlackBoard() { // initializare tabla de joc prin inserarea caracterului @ pe toate pozitiile matricii
        for(int i= 0; i<3; i++){  // pe fiecare linie
            for(int j=0; j<3 ; j++){ // si pe fiecare coloana a matricii de 3x3
                matrix[i][j] = '@'; // se umple toate elementele matricitii cu caracterul @
            }
        }
    }

    public void printBlackBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean checkBox(int row, int col) { // marcare casuta joc in functie de rand si coloana
        if((row>=0) && (row<3)){ // verificam daca randul introdus este intre 0 si 2
            if((col>=0) && (col <3)){ // pe urma verificam si daca coloana introdusa este intre 0 si 2
                if(matrix[row][col] == '@'){ // verificam daca elementul de pe linia si coloana specificata este gol
                    matrix[row][col] = currentPlayer; // inserarea jucatorului curent in pozitia specificata(in functie de randul si coloana specificata)
                    return true;
                }
            }
        }
        return false;
    }


    private boolean verifyRowsCols(char firstNum, char secondNum, char thirdNum){
        return ((firstNum != '@') && (firstNum == secondNum) && (secondNum == thirdNum));
    }

    private boolean verifyRows(){ // verificarea elementelor de pe randuri daca sunt egale
        for(int i=0; i<3; i++){
            if(verifyRowsCols(matrix[i][0], matrix[i][1], matrix[i][2]) == true){
                return true;
            }
        }
        return false;
    }

    private boolean verifyColumns(){ // verificarea elementelor de pe coloane daca sunt egale
        for(int i=0; i<3; i++){
            if(verifyRowsCols(matrix[0][i], matrix[1][i], matrix[2][i]) == true){
                return true;
            }
        }
        return false;
    }

    private boolean verifyDiagonals() { // verificarea elementelor de pe diagonala  daca sunt egale
            return((verifyRowsCols(matrix[0][0], matrix[1][1], matrix[2][2]) ==true) || (verifyRowsCols(matrix[0][2], matrix[1][1], matrix[2][0]) == true));
    }

    public boolean winnerOfTheGame(){ // verificare daca exista o varianta din cele specificate mai sus
        return ( verifyRows() || verifyColumns() || verifyDiagonals());
    }

    public boolean boardFull(){ //verificarea tabelei de joc daca este goala sau nu
        boolean tableFull = true;
        for(int i= 0; i<3; i++) {
            for(int j = 0; j<3; j++){
                if(matrix[i][j] == '@') {
                    tableFull = false;
                }
            }
        }
        return tableFull;
    }

    public void changePlayer() {// schimbarea jucatorului
        if(currentPlayer == 'x') { // jucatorul este setat initial ca fiind x, se verifica daca este x, iar daca este se face switch cu 0
          currentPlayer = '0' ;
        }
        else { // daca este jucatorul 0, se facec x
            currentPlayer = 'x';
        }
    }

}