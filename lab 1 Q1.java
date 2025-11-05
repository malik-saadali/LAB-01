import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int quizMarks;
        int assignmentMarks;
        int midTermMarks;
        int finalMarks;

        System.out.print("Enter Quiz Marks (out of 15): ");
        quizMarks = scanner.nextInt();

        System.out.print("Enter Assignment Marks (out of 10): ");
        assignmentMarks = scanner.nextInt();

        System.out.print("Enter Mid-Term Marks (out of 25): ");
        midTermMarks = scanner.nextInt();

        System.out.print("Enter Final Marks (out of 50): ");
        finalMarks = scanner.nextInt();

        int totalMarks = quizMarks + assignmentMarks + midTermMarks + finalMarks;


        double average = (double) totalMarks;

        String grade;

        if (average >= 85) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }

        System.out.println("\nTotal Marks = " + totalMarks);
        System.out.printf("Average = %.1f\n", average);
        System.out.println("Grade = " + grade);

        scanner.close();
    }
}