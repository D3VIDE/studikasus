package enrollment;

import courses.Course;
import students.Student;

public class EnrollmentService {
    public Student createStudent(String name, String studentId) {
        return new Student(name, studentId);
    }
}

