package de.copy.date;

import java.util.Scanner;

public class DateValidator {
    public String generateDate(){

        Scanner sc = new Scanner(System.in);
        int day,month,year;
        boolean isLeapYear = false;

        System.out.println("Enter DD/MM/YY: ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        if(year % 4 == 0){
            day = 29;
            isLeapYear = true;
        }

        // Makes the month valid if it's greater than 12
        if(month > 12){
            month = 12;
        }

        // Makes the day valid if the day is greater than 31 and if it's in these months
        if((month == 4 || month == 6 || month == 9 || month == 11) && (day > 30)){
            day = 30;
        }

        // Makes the day valid if the day is greater than 31 and if it's in these months
        if((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day > 31)) {
            day = 31;
        }

        String printedString = "Date: " + day + "." + month + "." + year + "\nIs a Leap year?: " + isLeapYear;
        return printedString;
    }
}
