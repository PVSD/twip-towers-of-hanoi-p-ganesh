package com.company;

public class towersOfHanoi {
    public static void solver (int discs, int peg1, int peg3, int peg2) {
        if (discs == 1)
            System.out.println("Move the top disc from tower " + peg1 + " to " + peg2);
        else {
            solver(discs-1, peg1, peg2, peg3);
            System.out.println("Move disc " + discs + " from tower " + peg1 + " to " + peg2);
            solver(discs-1, peg3, peg2, peg1);
        }
    }
}
