import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  // consume newline

        String[] names = new String[n];
        int[][] marks = new int[n][3];
        int[] totals = new int[n];
        String[] subjects = {"Math", "Science", "English"};

        // Input section
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            System.out.print("Name: ");
            names[i] = sc.nextLine();

            int total = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for " + subjects[j] + ": ");
                marks[i][j] = sc.nextInt();
                total += marks[i][j];
            }
            totals[i] = total;
            sc.nextLine(); // clean up
        }

        // Finding topper and lowest scorer
        int topperIndex = 0;
        int lowestIndex = 0;
        int grandTotal = 0;

        for (int i = 0; i < n; i++) {
            grandTotal += totals[i];

            if (totals[i] > totals[topperIndex]) {
                topperIndex = i;
            }

            if (totals[i] < totals[lowestIndex]) {
                lowestIndex = i;
            }
        }

        double classAverage = grandTotal / (double) n;

        // Output Section
        System.out.println("\n\n--------- STUDENT REPORT ---------");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent Name: " + names[i]);
            for (int j = 0; j < 3; j++) {
                System.out.println(subjects[j] + ": " + marks[i][j]);
            }

            double avg = totals[i] / 3.0;
            System.out.println("Total Marks: " + totals[i]);
            System.out.printf("Average Marks: %.2f\n", avg);

            // Grade and Result
            if (avg >= 90) {
                System.out.println("Grade: A");
                System.out.println("Result: Pass");
            } else if (avg >= 80) {
                System.out.println("Grade: B");
                System.out.println("Result: Pass");
            } else if (avg >= 70) {
                System.out.println("Grade: C");
                System.out.println("Result: Pass");
            } else if (avg >= 60) {
                System.out.println("Grade: D");
                System.out.println("Result: Pass");
            } else {
                System.out.println("Grade: F");
                System.out.println("Result: Fail");
            }
        }

        // Class-level Summary
        System.out.println("\n\n--------- CLASS SUMMARY ---------");
        System.out.printf("Class Average Marks: %.2f\n", classAverage);
        System.out.println("Topper: " + names[topperIndex] + " with " + totals[topperIndex] + " marks.");
        System.out.println("Lowest Scorer: " + names[lowestIndex] + " with " + totals[lowestIndex] + " marks.");

        sc.close();
    }
}





    



































 
    

