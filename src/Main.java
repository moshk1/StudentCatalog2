import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    StudentDatabase studentDatabase = new StudentDatabase();
    for (int i = 0; i < 1; i++) {
      System.out.println("Enter first Name: ");
      String firstName = in.nextLine();

      System.out.println("Enter last Name: ");
      String lastName = in.nextLine();

      System.out.println("Enter Grade: ");
      int gradeYear = in.nextInt();



     // Tuition balance = new Tuition();







     /*    Student stud = new Student.Builder("Anders", "Morken")
                  .age(34)
                  .id(10458)
                  .subjects("Math")
                  .tuition(500)
                  .build();

          Student stud1 = new Student.Builder("Vebjørn", "Fjeldberg")
                  .age(25)
                  .id(10459)
                  .subjects("English")
                  .tuition(250)
                  .build();
          studentDatabase.addStudent(stud);


            System.out.println(stud);
            System.out.println(stud1);
          }*/

//          System.out.println(studentDatabase.getNumberOfStudents());
//          System.out.println(studentDatabase.getStudentById(1000));

    }

  }

}

// TODO Add a cost per course and payment method (should also show the outstanding payment as well)
// TODO Add show status method
// TODO Add a list of courses that iterates through all courses and removing selected course(s)


// This under here is what I want to incorporate in my code somehow.

// show status
    /*public String toString() {
        return "Name: " + firstName + " " + lastName +
            "\nGrade Level: " + gradeYear +
            "\nStudent ID: " + studentId +
            "\nCourses Enrolled: " + courses +
            "\nOutstanding Balance: $" + tuitionBalance;
    }*/

// Input for courses
/*
 System.out.println("Available courses to enroll: ");
         for (String subject : courses) {
         System.out.println(subject + " ");
         }

         System.out.println();
         Scanner scanner = new Scanner(System.in);

         System.out.print("Choose subjects: ");
         String input = scanner.nextLine().toLowerCase();
         String[] array = input.split(", ");
         courses.removeAll(Arrays.asList(array));

         System.out.println("Available courses to enroll: ");
         for (String subject : courses) {
         System.out.println(subject + " ");
         }
         scanner.close();
         }

         } */