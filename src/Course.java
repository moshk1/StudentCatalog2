import java.util.ArrayList;
import java.util.Scanner;

// List of courses that can be chosen for enrollment.


public class Course {

  ArrayList<String> courses = new ArrayList<>();
      courses.add("Math");
      courses.add("Science");
      courses.add("History");
      courses.add("English");
      courses.add("Italian");
      courses.add("Spanish");
      courses.add("Computer Science");
      courses.add("Marketing");

      System.out.println("Available courses to enroll: " );
      for (String subject : courses) {
    System.out.println(subject + " ");
  }
      System.out.println();
  Scanner scanner = new Scanner(System.in);
      System.out.print("Choose subjects: ");
  String input = scanner.nextLine();
      courses.remove(input);

      System.out.println("Available courses to enroll: ");
      for (String subject : courses) {
    System.out.print(subject + " ");
  }
      scanner.close();








// TODO Or this :

 /* private final ArrayList<String> courseList;

  public Course() {
    courseList = new ArrayList<>();
  }

  public void addCourse(String courses) {
    if (this.courseList.contains(courses)) {
      System.out.println("Course already exist");
    } else {
      courseList.add(courses);
    }
  }

  public void deleteCourse(String courses) {
    if(this.courseList.contains(courses)) {
      for(int i = 0; i < this.courseList.size(); i++) {
        if(this.courseList.get(i).equals(courses)) {
          this.courseList.remove(i);
        }
      }
    } else {
      System.out.println("Course doesn't exist");
    }
  }*/
}


