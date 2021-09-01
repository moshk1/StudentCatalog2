import java.util.ArrayList;

// List of courses that can be chosen for enrollment.

public class Course {

  private final ArrayList<String> courseList;

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
  }
}

// 2.0
