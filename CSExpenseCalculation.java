import java.util.*;

public class CSExpenseCalculation {
    public static void main(String[] args) {
        // When purchasing certain items, a discount of 10% is offered if the quantity
        // purchased is more than 100. If quantity and price per item are input through
        // the keyboard, write a program to calculate the total expenses

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Price of Item ");
        int price = sc.nextInt();
        System.out.println("Enter Qunatity of Item ");
        int quantity = sc.nextInt();

        int totalExpense = price * quantity; 

        if (quantity > 100) {
            int discount = totalExpense / 10;
            totalExpense = totalExpense - discount;
        }

        System.out.println(totalExpense);

    }
}
