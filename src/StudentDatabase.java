import java.util.ArrayList;

public class StudentDatabase {

    private final ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }
    public int getNumberOfStudents() {
        return students.size();
    }
    public Student getStudentById(int studentId) {
        for (Student student : students) {
            if (student.StudentId() == studentId) {
                return student;
            }
        }
        System.out.println("Student doesn't exist");
        return null;
    }

 }
