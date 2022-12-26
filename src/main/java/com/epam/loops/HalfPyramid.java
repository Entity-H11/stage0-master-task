package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String current = "";
            for (int n = i; n > 0; n--) {
                current += "*";
            }
            System.out.printf("%" + cathetusLength + "s\n", current);
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
