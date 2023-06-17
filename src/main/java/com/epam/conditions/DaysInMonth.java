package com.epam.conditions;

import java.time.LocalDate;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if(year < 1 || month < 1 || month > 12){
            System.out.println("invalid date");
        }else{
            LocalDate localDate = LocalDate.of(year, month, 1);
            System.out.println(localDate.lengthOfMonth());
        }

    }

}
