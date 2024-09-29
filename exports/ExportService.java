package exports;

import courses.Course;
import students.Student;
import students.Transcript;

public interface ExportService {
    String exportStudent(Student student);
    String exportCourse(Course course);
    String exportTranscript(Transcript transcript);
}
