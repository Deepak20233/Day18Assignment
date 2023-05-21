package com.java;

import java.util.Scanner;

public class DesiredMove {
	private static int playLocation;
	static char player, computer;
	static char[] board = new char[10];
	public static Scanner scannerObject = new Scanner(System.in);
	 public static void userMove() {
		  System.out.println("\nPlayer Is Playing");
	        System.out.println("\nEnter Location 1-9 to Make Move");

	        while (true) {
	            playLocation = scannerObject.nextInt();
	            scannerObject.nextLine();
	            if (isEmpty(playLocation) && playLocation < 10 && playLocation > 0) {

	                board[playLocation] = player;
	                showBoard();
	                break;
	            } else {
	                System.out.println("Invalid Choice. Please Enter position again.");

	            }
	        }
	    }
	 public static void showBoard() {
	        System.out.println();
	        System.out.println("  " + board[1] + "  |  " + board[2] + "   | " + board[3] + "  ");
	        System.out.println("------------------");
	        System.out.println("  " + board[4] + "  |  " + board[5] + "   | " + board[6] + "  ");
	        System.out.println("------------------");
	        System.out.println("  " + board[7] + "  |  " + board[8] + "   | " + board[9] + "  ");
	    }
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
	 /*
	  * UC5 ability to check free space before making desire move
	  */
	  public static boolean isEmpty(int location) {
	        return board[location] == ' ';

	    }
	public static void main(String[] args) {
		createBoard();
		getPlayerChoice();
		userMove();

	}

}