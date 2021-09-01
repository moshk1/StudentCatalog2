import lombok.Builder;

@Builder
public class Student {

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private int studentId;
        private String subjects;
        private int tuition;

        private Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        private Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        private Builder age(int age) {
            this.age = age;
            return this;
        }

        private Builder studentId(int studentId) {
            this.studentId = studentId;
        }

        private Builder subjects(String subjects) {
            this.subjects = subjects;
            return this;
        }

        private Builder tuition(int tuition) {
            this.tuition = this.tuition;
            return this;
        }

        public Student build() {
            return new Student(this);
        }

        private void Student(Builder builder) {
            firstName = builder.firstName;
            lastName = builder.lastName;
            age = builder.age;
            studentId = builder.studentId;
            subjects = builder.subjects;
            this.tuition = builder.tuition;
        }


    }
}