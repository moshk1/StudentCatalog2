import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.lang.String;

import javax.swing.plaf.synth.SynthTreeUI;

@Builder @NoArgsConstructor @AllArgsConstructor
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int studentId;
    private String subjects;
    private int tuition;

    public Student(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.studentId = builder.studentId;
        this.subjects = builder.subjects;
        this.tuition = builder.tuition;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + ", Age: " + age + ", StudentID: " + studentId + ", Courses: " + subjects + ", Tuition: " + tuition;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private int studentId;
        private String subjects;
        private int tuition;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
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
            this.tuition = tuition;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

    }
}