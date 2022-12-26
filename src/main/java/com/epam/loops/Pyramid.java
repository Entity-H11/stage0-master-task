package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            String current = "";
            for (int n = i; n > 0; n--) {
                current += n;
            }
            String reversed = new StringBuilder(current).reverse().toString();
            System.out.printf("%" + cathetusLength + "s%s\n", current, reversed.substring(1));
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
