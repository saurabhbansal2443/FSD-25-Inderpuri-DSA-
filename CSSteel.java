public class CSSteel {
    public static void main(String[] args) {
        // 17) A certain grade of steel is graded according
        // to the following conditions
        // Hardness must be greater than 50
        // Carbon content must be less than 0.7
        // Tensile strength must be greater than 5600
        // The grades are as follows:
        // The grade is 10 if all three conditions are met
        // The grade is 9 if conditions (i) and (ii) are met
        // The grade is 8 if conditions (ii) and (iii) are met
        // The grade is 7 if conditions (i) and (iii) are met
        // The grade is 6 if only one condition is met
        // The grade is 5 if none of the conditions are met

        int hardness = 60;
        double carbon = 0.3;
        int ts = 6500;

        // if (hardness > 50 && carbon < 0.7 && ts > 5600) {
        // System.out.println("Grade 10 ");
        // } else if (hardness > 50 && carbon < 0.7) {
        // System.out.println("Grade 9 ");
        // } else if (carbon < 0.7 && ts > 5600) {
        // System.out.println("Grade 8 ");
        // } else if (hardness > 50 && ts > 5600) {
        // System.out.println("Grade 7 ");
        // } else if (hardness > 50 || carbon < 0.7 || ts > 5600) {
        // System.out.println("Grade 6 ");
        // } else {
        // System.out.println("Grade 5 ");
        // }

        boolean hardnessPass = hardness > 50;
        boolean carbonPass = carbon < 0.7;
        boolean TSpass = ts > 6500;

        if (hardnessPass && carbonPass && TSpass) {
            System.out.println("Grade 10 ");
        } else if (hardnessPass && carbonPass) {
            System.out.println("Grade 9 ");
        } else if (carbonPass && TSpass) {
            System.out.println("Grade 8 ");
        } else if (hardnessPass && TSpass) {
            System.out.println("Grade 7 ");
        } else if (hardnessPass || carbonPass || TSpass) {
            System.out.println("Grade 6 ");
        } else {
            System.out.println("Grade 5 ");
        }

    }
}
