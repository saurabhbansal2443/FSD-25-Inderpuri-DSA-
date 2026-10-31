package IfElse;
public class CSDaysInMonth {
    public static void main(String[] args) {
        // Write a Java program to find days in a month
        // (Take input of Year and month number).

        int year = 2004;
        int month = 2;

        // if (year % 4 == 0 && month == 2) {
        // System.out.println("29 days");
        // } else if (month == 2) {
        // System.out.println("28 days");
        // } else if (month == 4 || month == 6 || month == 11 || month == 9) {
        // System.out.println("30 days");
        // } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
        // || month == 10 || month == 12) {
        // System.out.println("31 Days ");
        // }

        if (month == 2) {
            if (year % 4 == 0) {
                System.out.println("29 Days");
            } else {
                System.out.println("28 Days");
            }
        } else if (month == 1) {
            System.out.println("31 Days");
        }else if (month == 3) {
            System.out.println("31 Days");
        }
    }
}
