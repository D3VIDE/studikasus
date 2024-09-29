package exports;

import courses.Course;
import students.Student;
import students.Transcript;

public class CsvExportService implements ExportService {

    @Override
    public String exportStudent(Student student) {
        return student.getName() + "," + student.getStudentId();
    }

    @Override
    public String exportCourse(Course course) {
        return course.getCourseName();
    }

    @Override
    public String exportTranscript(Transcript transcript) {
        return "GPA," + transcript.getGPA();
    }
}
