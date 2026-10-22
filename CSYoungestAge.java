public class CSYoungestAge {
    public static void main(String[] args) {
        // If the ages of Ram, Shyam and Ajay are input through 
        // the keyboard, write a
        // program to determine the youngest of the three

        int ram = 30;
        int shyam = 25;
        int ajay = 10;

        if (ram < shyam) {
            if (ram < ajay) {
                System.out.println("Ram");
            } else {
                System.out.println("Ajay");
            }
        } else if (shyam < ajay) {
            System.out.println("Shyam");
        }else{
            System.out.println("Ajay"); 
        }

    }
}
