package IfElse;
import java.util.*;

public class CSAlphabet {
    public static void main(String[] args) {
        // Write a program to check whether a given character is an Alphabet or not.

        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
            System.out.println("Alphabet");
        } else {
            System.out.println("Invalid");
        }
    }
}