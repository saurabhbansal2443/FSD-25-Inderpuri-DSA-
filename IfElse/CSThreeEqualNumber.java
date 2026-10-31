package IfElse;
public class CSThreeEqualNumber {
    public static void main(String[] args) {

        // Write a Java program that accepts three numbers and checks whether all
        // numbers are equal or not

        int a = 9;
        int b = 9;
        int c = 9;

        if (a == b) {
            if (a == c) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
