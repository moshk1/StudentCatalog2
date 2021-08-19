import java.util.ArrayList;
import java.util.Iterator;

public class Courses {
  ArrayList<String> courseList = new ArrayList<>();
            courseList.add("Math");
            courseList.add("Science 101");
            courseList.add("History 101");
            courseList.add("English");
            courseList.add("Spanish");
            courseList.add("German");


  System.out.println(courseList);


  Iterator<String> itr = courseList.iterator();
    while (itr.hasNext()) {
      String classes = itr.next();
      if (courseList.equals("Math")) {
      itr.remove();
    }
      }
  System.out.println(courseList);
}
