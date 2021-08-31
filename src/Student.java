public class Student {

    private  String firstName;
    private  String lastName;
    private  int gradeYear;
    private final int studentId;
    private  String courses;
    private  int tuition;

    private Student(StudentBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.gradeYear = builder.gradeYear;
        this.studentId = builder.studentId;
        this.courses = builder.courses;
        this.tuition = builder.tuition;
    }

    public String setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String setLastName() {
        return lastName;
    }
    public int getGradeYear() {
        return gradeYear;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getTuition() {
        return tuition;
    }

    @Override
    public String toString() {
        return "Student: "+this.firstName+" "+this.lastName+", Gradeyear: "+this.gradeYear+", StudentId: "+this.studentId+", Enrolled courses: "+this.courses+", Tuition: "+this.tuition;
    }

    public static class StudentBuilder {
        private String firstName;
        private String lastName;
        private int gradeYear;
        private int studentId;
        private String courses;
        private int tuition;

        public StudentBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public StudentBuilder year(int gradeYear) {
            this.gradeYear = gradeYear;
            return this;
        }
        public StudentBuilder id(int studentId) {
            this.studentId = studentId;
            return this;
        }
        public StudentBuilder classes(String courses) {
            this.courses = courses;
            return this;
        }
        public StudentBuilder payment(int tuition) {
            this.tuition = tuition;
            return this;
        }

        public Student build() {
            Student student = new Student(this);
//            validateStudentData(student);
            return student;
        }
        /*private boolean validateStudentData() {
            return true;
        }*/

    }

}