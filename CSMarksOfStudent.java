public class CSMarksOfStudent {
    public static void main(String[] args) {
        // Write a program to input marks of five subjects Physics, Chemistry, Biology,
        // mathematics, and computer Calculate percentages and grades according to
        // following:
        // Percentage >= 90%: Grade A
        // Percentage >= 80%: Grade B
        // Percentage >= 70%: Grade C
        // Percentage >= 60%: Grade D
        // Percentage >= 40%: Grade E
        // Percentage < 40%: Grade F

        int phy = 93;
        int chem = 80;
        int maths = 56;
        int bio = 70;
        int cs = 100;

        int totalMarksObtained = phy + chem + maths + bio + cs;
        int totalMarks = 500;
        // int percentage = (totalMarksObtained / totalMarks) * 100; // Wrong
        int percentage = (totalMarksObtained * 100) / totalMarks;

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }

    }
}
