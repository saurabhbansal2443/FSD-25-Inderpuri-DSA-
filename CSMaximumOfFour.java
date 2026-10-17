public class CSMaximumOfFour {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int c = 12;
        int d = 9;

        if (a > d) {
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
        } else if (b > c) {
            if (b > d) {
                System.out.println("B" + b);
            } else {
                System.out.println("D" + d);
            }
        } else if (c > d) {
            System.out.println("C" + c);
        } else {
            System.out.println("D" + d);
        }

        
    }
}
