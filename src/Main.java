import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Counter for adding ID
        int idCounter = 1000;

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

            System.out.println("You have to pay: ");
            int tuition = in.nextInt();

            Student student = new Student.StudentBuilder(firstName, lastName).year(gradeYear).id(idCounter).classes(courses).payment(tuition).build();
            studentDatabase.addStudent(student);

            idCounter++;

        }
        System.out.println(studentDatabase.getNumberOfStudents());
        System.out.println(studentDatabase.getStudentById(1000));
    }

}

// TODO check the error on tuition and courses
// TODO Add a cost per course and payment method (should also show the outstanding payment as well)
// TODO Add show status method
// TODO stud is redundant - check this
// TODO Add a list of courses

// TODO Move the studentBuilder to main?