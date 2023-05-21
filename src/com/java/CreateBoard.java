package com.java;

public class CreateBoard {
	static char[] board = new char[10];
public static void main (String []args) {
	createBoard();
}
public static void createBoard() {
    for (int index = 1; index < 10; index++) {
        board[index] = ' ';
    }
}
}
