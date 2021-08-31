import java.util.Scanner;

// logic for seeing how much you have to pay

public class Tuition {
    private int tuitionBalance = 0;
    private static int costOfCourse = 400;


    public void viewBalance() {
        tuitionBalance = tuitionBalance + costOfCourse;
        System.out.println("The tuition fee is: $" + tuitionBalance);
        }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;

    }



}

