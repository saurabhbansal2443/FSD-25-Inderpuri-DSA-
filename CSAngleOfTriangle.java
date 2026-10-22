public class CSAngleOfTriangle {
    public static void main(String[] args) {
        // Write a program to input all angles of a triangle and check whether it is
        // valid or not

        int angle1 = 90;
        int angle2 = 45;
        int angle3 = 45;

        if (angle1 + angle2 + angle3 == 180) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}