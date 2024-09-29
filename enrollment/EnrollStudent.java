package enrollment;

import courses.Course;
import students.Student;

public class EnrollStudent implements Base {
    private Student student;
    private Course course;

    public EnrollStudent(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    @Override
    public void execute() {
        student.enrollInCourse(course);
    }
}
