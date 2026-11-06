import java.util.Scanner;

public class MarksEntryChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = input.nextInt();

        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid Marks");
        } else {
            System.out.println("Invalid Marks");
        }

        input.close();
    }
}
