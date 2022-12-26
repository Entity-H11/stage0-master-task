package com.epam.algorithms;



/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arrayOfIntegers = new int[length];
        for (int num = 0; num < length; num++) {
            arrayOfIntegers[num] = num + 1;
        }

        return arrayOfIntegers;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {

        int total = 0;
        for (int index = 0; index < arr.length; index++) {
            total += arr[index];
        }
        return total;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
//        int currentIndex = -1;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == number) {
                return index;
            }
        }

        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] reversed = new String[arr.length];
        for (int index = arr.length; index > 0; index--) {
            reversed[arr.length - index] = arr[index - 1];
        }
        return reversed;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int counter = 0;
        for (int current = 0; current < arr.length; current++) {
            if (arr[current] > 0) counter++;
        }

        int[] positiveNumbers = new int[counter];
        counter = 0;

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] <= 0) continue;
            positiveNumbers[counter++] = arr[index];
        }

        return positiveNumbers;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {

//        // sortByLength
        for (int counter = 0; counter < arr.length; counter++) {
            for (int elem = 1; elem < arr.length; ++elem) {
                if (arr[elem].length < arr[elem - 1].length ) {
                    int[] replacer = arr[elem];
                    arr[elem] = arr[elem -1];
                    arr[elem - 1] = replacer;
//                   break;
                }
            }
        }

        // sortByElement
        for (int counter = 0; counter < arr.length; counter++) {

            for (int elem = 0; elem < arr[counter].length; ++elem) {

                for (int index = 1; index < arr[counter].length; index++) {

                    if (arr[counter][index] < arr[counter][index - 1]) {
                        int actual = arr[counter][index];
                        arr[counter][index] = arr[counter][index - 1];
                        arr[counter][index - 1] = actual;
                        break;
                    }
                }
            }
        }


        return arr;
    }



}
