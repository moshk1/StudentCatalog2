import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  /*public Student buildStudent() {
    validateStudentData();
    return new Student(this);
  } */
  /*private boolean validateStudentData() {
    return true;
  }*/

  // List of available courses
  public static void listOfCourses() {

    List<String> courseList = new ArrayList<>();
    courseList.add("1. Math");
    courseList.add("2. English");
    courseList.add("3. Science 101");
    courseList.add("4. History");
    courseList.add("5. Spanish");

    System.out.println("You can choose from these courses: ");
    courseList.forEach(System.out::println);
    System.out.println(" ");

  }


  public static void main(String[] args) {

        // Counter for adding ID
        int idCounter = 1000;
        idCounter++;

        Scanner in = new Scanner(System.in);

        StudentDatabase studentDatabase = new StudentDatabase();
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter first Name: ");
            String firstName = in.nextLine();

            System.out.println("Enter last Name: ");
            String lastName = in.nextLine();

            System.out.println("Enter Grade: ");
            int gradeYear = in.nextInt();

            listOfCourses();
            System.out.println("Enter desired course (Q to quit): ");
            String courses = in.nextLine();

            /*System.out.println("You have to pay: ");
            int tuition = in.nextInt();*/

          Student stud = new Student.StudentBuilder(firstName, lastName).year(gradeYear).id(idCounter).classes(courses).build();
          studentDatabase.addStudent(stud);

          break;
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
