package com.java;

import java.util.Scanner;

public class ChooseXorO {
	    static char[] board = new char[10];
	    static char player, computer;
	    public static Scanner scannerObject = new Scanner(System.in);
	public static void createBoard() {
        for (int index = 1; index < 10; index++) {
            board[index] = ' ';
        }
     
    }
	public static void getPlayerChoice() {

        System.out.print("Choose X or O : ");
        player = Character.toUpperCase(scannerObject.next().charAt(0));

        if (player == 'X')
            computer = 'O';
        else
            computer = 'X';
        System.out.println("You have selected : " + player);
        System.out.println("Computer's choice is : " + computer);
    }
	
	public static void main(String[] args) {
		createBoard();
        getPlayerChoice();

	}
}

