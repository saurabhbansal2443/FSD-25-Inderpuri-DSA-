public class CSUpperLowerCase {
    public static void main(String[] args) {
        // Write a program to check whether a
        // character is uppercase or lowercase.
        char ch = 'c';
        // int asciiVal = (int) ch;
        // System.out.println(asciiVal);

        // if (asciiVal >= 65 && asciiVal <= 90) {
        // System.out.println("Upper Case");
        // } else if (asciiVal >= 97 && asciiVal <= 122) {
        // System.out.println("Lower Case");
        // } else {
        // System.out.println("Invalid Alphabet");
        // }

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case ");
        } else {
            System.out.println("Invalid Alphabet");
        }

    }
}
