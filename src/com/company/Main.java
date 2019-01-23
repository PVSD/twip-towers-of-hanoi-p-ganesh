package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to the Towers of Hanoi.\nEnter the number of discs you would like to play with:");

        int discs = kb.nextInt();

        towersOfHanoi.solver(discs, 1, 3, 2);
    }
}
