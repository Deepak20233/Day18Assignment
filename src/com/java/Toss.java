package com.java;

import java.util.Scanner;

public class Toss {
	private static int playLocation;
	private static boolean playerWinToss;
	static char player, computer;
	static char[] board = new char[10];
	public static Scanner scannerObject = new Scanner(System.in);
	

	  public static void checkToss() {

	        double tossResult = Math.floor(Math.random() * 10) % 2;
	        System.out.println("\nChoose 1 for Heads or 2 for Tails");
	        int coinSelect = scannerObject.nextInt();
	        if (coinSelect == tossResult) {
	            System.out.println("\nPlayer Won The Toss! Player Starts");
	            playerWinToss = true;
	        } else {
	            playerWinToss = false;
	            System.out.println("\nComputer Won The Toss! Computer Starts");
	        }
	    }
	public static void main(String[] args) {
		checkToss();
	

	}

}