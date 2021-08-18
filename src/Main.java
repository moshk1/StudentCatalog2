import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Counter for å legge til ID
        int idCounter = 1000;

        Scanner in = new Scanner(System.in);


        StudentDatabase studentDatabase = new StudentDatabase();
        for (int i = 0; i < 2; i++) {
            System.out.println("First Name: ");
            String firstName = in.nextLine();

            System.out.println("Last Name: ");
            String lastName = in.nextLine();

            System.out.println("Grade: ");
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

// TODO sjekke tuition og courses
// TODO Legge til payment funksjon
// TODO vise status