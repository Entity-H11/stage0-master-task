package com.epam.loops;

public class Power {

    public void printPower(int numberToPrint, int power) {
            long powered = 1;
            for(int powNumber = power; powNumber > 0; powNumber--) powered *= numberToPrint;
            System.out.println(powered);

    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }

}
