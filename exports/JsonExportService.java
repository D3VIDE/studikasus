package exports;

import courses.Course;
import students.Student;
import students.Transcript;

public class JsonExportService implements ExportService {

    @Override
    public String exportStudent(Student student) {
        return "{ \"name\": \"" + student.getName() + "\", \"id\": \"" + student.getStudentId() + "\" }";
    }

    @Override
    public String exportCourse(Course course) {
        return "{ \"courseName\": \"" + course.getCourseName() + "\" }";
    }

    @Override
    public String exportTranscript(Transcript transcript) {
        return "{ \"gpa\": " + transcript.getGPA() + " }";
    }
}
