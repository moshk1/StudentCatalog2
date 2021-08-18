import java.util.Scanner;

public class Main {

        public static void main(String[] args) {


        // Counter for adding ID
        int idCounter = 1000;

        // Tuition per course
       /* int costOfCourse = 500;
        int tuitionBalance = 0;*/


        Scanner in = new Scanner(System.in);


        StudentDatabase studentDatabase = new StudentDatabase();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter first Name: ");
            String firstName = in.nextLine();

            System.out.println("Enter last Name: ");
            String lastName = in.nextLine();

            System.out.println("Enter Grade: ");
            int gradeYear = in.nextInt();

            System.out.println("Enter course(s): ");
            String courses = in.nextLine();

            /*System.out.println("You have to pay: ");
            int tuition = in.nextInt();*/

            Student student = new Student.StudentBuilder(firstName, lastName).year(gradeYear).id(idCounter).classes(courses).build();
            studentDatabase.addStudent(student);

            idCounter++;

        }
        System.out.println(studentDatabase.getNumberOfStudents());
        System.out.println(studentDatabase.getStudentById(1000));

    }
   /* public void viewBalance() {
        public void viewBalance() {
            System.out.println("The tuition fee is: $" + tuitionBalance);
    }

    public void payTuition() {
        viewBalance();
        System.out.print("Enter payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for the payment of $" + payment);

    }*/
    // show status
    /*public String toString() {
        return "Name: " + firstName + " " + lastName +
            "\nGrade Level: " + gradeYear +
            "\nStudent ID: " + studentId +
            "\nCourses Enrolled: " + courses +
            "\nOutstanding Balance: $" + tuitionBalance;
    }*/

}

// TODO check the error on tuition and courses
// TODO Add a cost per course and payment method (should also show the outstanding payment as well)
// TODO Add show status method
// TODO stud is redundant - check this
// TODO Add a list of courses

// TODO Move the studentBuilder to main?