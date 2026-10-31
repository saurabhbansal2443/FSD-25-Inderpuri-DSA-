package IfElse;
public class CSAreaPermimeter {
    public static void main(String[] args) {
        // You are given two integers
        // that are the length and
        // breadth of the rectangle.
        // Check whether the area or
        // perimeter is greater

        int l = 4;
        int b = 5;

        int area = l * b;
        int perimeter = 2 * (l + b);

        if (area > perimeter) {
            System.out.println("Area " + area);
        } else if (perimeter > area) {
            System.out.println("Perimeter " + perimeter);
        } else {
            System.out.println("Both are equal");
        }
    }
}
