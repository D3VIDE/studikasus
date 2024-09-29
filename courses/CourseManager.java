package courses;
import java.util.*;;
public class CourseManager {
    private CourseCreator creator;

    public CourseManager(CourseCreator creator) {
        this.creator = creator;
    }

    public Course constructOnlineCourse(String courseId, String courseName) {
        return creator.setCourseId(courseId)
                .setCourseName(courseName)
                .setOnline(true)
                .setLocation("Online Platform")
                .build();
    }

    public Course constructOnsiteCourse(String courseId, String courseName, String location) {
        return creator.setCourseId(courseId)
                .setCourseName(courseName)
                .setOnline(false)
                .setLocation(location)
                .build();
    }

    // Method untuk mengconstruct course dengan prerequisites (syarat untuk ambil course tsb)
    public Course constructCourseWithPrerequisites(String courseId, String courseName, boolean isOnline, String location, ArrayList<CourseComponent> prerequisites) {
        return creator.setCourseId(courseId)
                .setCourseName(courseName)
                .setOnline(isOnline)
                .setLocation(location)
                .setPrerequisites(prerequisites)
                .build();
    }
}
