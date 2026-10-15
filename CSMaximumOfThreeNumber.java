public class CSMaximumOfThreeNumber {
    public static void main(String[] args) {
        // You are given 3 number find the maximum between them
        int a = 10;
        int b = 19;
        int c = 6;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            } else {
                System.out.println(c);
            }
        } else if (b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
