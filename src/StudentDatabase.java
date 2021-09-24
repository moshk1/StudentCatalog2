import java.util.ArrayList;

// This class should hold the logic for the registration and storing of students.
// New input of students and should contain a list that the user can iterate through (Have to separate the class for input method)

public class StudentDatabase {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    /*public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.StudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Student doesn't exist");
        return null;
    }*/

 }
