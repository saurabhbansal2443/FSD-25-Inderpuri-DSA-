package IfElse;
public class CSTriangle {
    public static void main(String[] args) {
        // Write a program to check whether the triangle
        // is equilateral, isosceles or scalene triangle

        int side1 = 4;
        int side2 = 5;
        int side3 = 6;

        // if (side1 == side2) {
        // if (side1 == side3) {
        // System.out.println("Equilateral");
        // } else {
        // System.out.println("Isosceles");
        // }
        // } else if (side1 == side3) {
        // System.out.println("Isosceles");
        // } else if (side2 == side3) {
        // System.out.println("Isosceles");
        // } else {
        // System.out.println("Scalene");
        // }

        if (side1 == side2 && side1 == side3) {
            System.out.println("Equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
