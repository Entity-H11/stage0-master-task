package com.epam.conditions;

import java.time.LocalDate;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if ((month <= 12 && month >= 1) && year > 0) {
            System.out.println(LocalDate.of(year, month, month).lengthOfMonth());
        } else {
            System.out.println("invalid date");
        }
    }

}
