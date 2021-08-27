import java.util.ArrayList;
import java.util.List;

public class Courses {


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

    List<String> toRemove = new ArrayList<>();
    for (String remove : courseList) {
      toRemove.add("Math");
      toRemove.add("English");
    }
    courseList.removeAll(toRemove);

   /*  I want to build an ArrayList that iterates through each course and removes the one that is chosen
     from the user.*/

  }
}
