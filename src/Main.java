import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {




  public static void main(String[] args) {

        // Counter for adding ID
        int idCounter = 1000;
        idCounter++;

        Scanner in = new Scanner(System.in);

        StudentDatabase studentDatabase = new StudentDatabase();
        for (int i = 0; i < 1; i++) {
            System.out.println("Enter first Name: ");
            String firstName = in.nextLine();

            System.out.println("Enter last Name: ");
            String lastName = in.nextLine();

            System.out.println("Enter Grade: ");
            int gradeYear = in.nextInt();

         //   System.out.println("List of available courses: " + courses);
            System.out.println("Enter course(s) to be enrolled: ");
            String courses = in.nextLine();

           // viewBalance();


         Student stud = new Student.StudentBuilder("Anders", "Morken")
                  .year(2021)
                  .id(10458)
                  .classes("Math")
                  .payment(500)
                  .build();

          Student stud1 = new Student.StudentBuilder("Vebjørn", "Fjeldberg")
                  .year(2021)
                  .id(10459)
                  .classes("English")
                  .payment(250)
                  .build();
         // studentDatabase.addStudent(stud);


            System.out.println(stud);
            System.out.println(stud1);
          }

//          System.out.println(studentDatabase.getNumberOfStudents());
//          System.out.println(studentDatabase.getStudentById(1000));

        }

    }

// TODO check the error on tuition and courses
// TODO Add a cost per course and payment method (should also show the outstanding payment as well)
// TODO Add show status method
// TODO stud is redundant - check this
// TODO Add a list of courses

// TODO Move the studentBuilder to main?

// This under here is what I want to incorporate in my code somehow.

/*  public void enroll(String courses) {
    do {
      System.out.println("Enter desired course (Q to quit): ");

      String course = courses;
      if (!course.equals("Q")) {
        courses = courses + "\n " + course;
      } else {
      }
    } while (true);

  }*/



// show status
    /*public String toString() {
        return "Name: " + firstName + " " + lastName +
            "\nGrade Level: " + gradeYear +
            "\nStudent ID: " + studentId +
            "\nCourses Enrolled: " + courses +
            "\nOutstanding Balance: $" + tuitionBalance;
    }*/
