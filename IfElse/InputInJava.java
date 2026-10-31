package IfElse;
import java.util.*;

public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a number ");
        int a = sc.nextInt();
        System.out.println("Input a string");
        String str = sc.next();
        System.out.println("Input a Double number");
        double db = sc.nextDouble();
        System.out.println("Input a Charcter");
        char ch = sc.next().charAt(0);

        System.out.println("a " + a);
        System.out.println("str " + str);
        System.out.println("db " + db);
        System.out.println("ch " + ch);

    }
}
