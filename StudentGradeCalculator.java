import java.util.*;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numofSubjects = sc.nextInt();
        int[] marks = new int[numofSubjects];
        int totalM = 0;
        for (int i = 0; i < numofSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = sc.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid input! Marks should be between 0 and 100.");
                i--;
                continue;
            }
            totalM += marks[i];
        }
        double average = (double) totalM / numofSubjects;
        String grade;
        if (average >= 90) {
            grade = "O";
        } else if (average >= 80) {
            grade = "E";
        } else if (average >= 70) {
            grade = "A";
        } else if (average >= 60) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.println("\n<------- Result ------->");
        System.out.println("Total Marks: " + totalM + " / " + (numofSubjects * 100));
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
    }
}
