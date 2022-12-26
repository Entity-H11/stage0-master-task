package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
    	
    	try(Scanner sc = new Scanner(System.in)){
    		int inputToMultiply = sc.nextInt();
    		
    		for(int multiplier = 1; multiplier <=10; multiplier++) {
    			System.out.println(multiplier * inputToMultiply);
    		}
    	}
    }

}
