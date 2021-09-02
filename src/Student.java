import lombok.Builder;

@Builder
public class Student {
    private final String name;
    private final int age;
    private final int studentId;
    private final String subjects;
    private final int tuition;

    public static class Builder {
        private String name;
        private int age;
        private int studentId;
        private String subjects;
        private int tuition;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder id(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder subjects(String subjects) {
            this.subjects = subjects;
            return this;
        }

        public Builder tuition(int tuition) {
            this.tuition = this.tuition;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }

    private void Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.studentId = builder.studentId;
        this.subjects = builder.subjects;
        this.tuition = builder.tuition;

    }
    @Override
    public String toString() {
        return "Name: " + this.name + ", Age:" + age + ", StudentID:" + studentId + ", Courses:" + subjects + ", Tuition:" + tuition;
    }

}