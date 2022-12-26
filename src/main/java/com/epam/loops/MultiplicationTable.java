package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println(multiplier + " x " +  numberTableToPrint + " = " + (multiplier * numberTableToPrint));
        }
    }


}
