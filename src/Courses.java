import java.util.ArrayList;

// List of courses that can be chosen for enrollment.

public class Courses {

  private final ArrayList<String> courseList;

  public Courses() {
    courseList = new ArrayList<>();
  }

  public void addCourse(String course) {
    if (this.courseList.contains(course)) {
      System.out.println("Course already exist");
    } else {
      courseList.add(course);
    }
  }

  public void deleteCourse(String course) {
    if(this.courseList.contains(course)) {
      for(int i = 0; i < this.courseList.size(); i++) {
        if(this.courseList.get(i).equals(course)) {
          this.courseList.remove(i);
        }
      }
    } else {
      System.out.println("Course doesn't exist");
    }
  }
}


