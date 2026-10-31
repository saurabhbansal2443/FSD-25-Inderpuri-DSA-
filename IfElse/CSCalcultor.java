package IfElse;
import java.util.*;

public class CSCalcultor {
    public static void main(String[] args) {
        // 18) Write a Java program to create a simple calculator for calculating a two
        // number calculations
        // Hint-> Take 2 Input of Number and one character as sign (-, +, *, /)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int n = sc.nextInt();
        System.out.println("Enter the operator ");
        char op = sc.next().charAt(0);
        System.out.println("Enter the second Number");
        int m = sc.nextInt();

        if (op == '+') {
            System.out.println(n + m);
        } else if (op == '-') {
            System.out.println(n - m);
        } else if (op == '*') {
            System.out.println(n * m);
        } else if (op == '/') {
            System.out.println(n / m);
        } else if (op == '%') {
            System.out.println(n % m);
        } else {
            System.out.println("Invalid Operator");
        }

    }
}