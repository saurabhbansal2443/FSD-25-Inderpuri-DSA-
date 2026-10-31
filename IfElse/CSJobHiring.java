package IfElse;
import java.util.*;

public class CSJobHiring {
    public static void main(String[] args) {
        // 15) A company hires a person if
        // If person is married
        // if person is unmarried, male and above 30 years of age
        // if person is unmarried , female and above 25 years of age
        Scanner sc = new Scanner(System.in);

        System.out.println("Ennter the married Status "); // M , U , m , u
        char maritialStatus = sc.next().charAt(0);
        System.out.println("Ennter the gender Status "); // M , F , m , f
        char gender = sc.next().charAt(0);
        System.out.println("Ennter the age  ");
        int age = sc.nextInt();

        if (maritialStatus == 'M' || maritialStatus == 'm') {
            System.out.println("Hired");
        } else if (age > 30 && (gender == 'm' || gender == 'M')) {
            System.out.println("Hired");
        } else if (age > 25 && (gender == 'f' || gender == 'F')) {
            System.out.println("Hired");
        } else {
            System.out.println("Not Hired");
        }

    }
}
