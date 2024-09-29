package courses;
import java.util.*;

import Notifw.CourseNotifier;;
public class CourseManager {
    private CourseCreator creator;
    private CourseNotifier courseNotifier;

    public CourseManager(CourseCreator creator,CourseNotifier courseNotifier) {
        this.creator = creator;
        this.courseNotifier = courseNotifier;
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
    
    public void createNewCourse(String courseId, String courseName) {
        // Proses pembuatan kursus
        Course newCourse = creator.setCourseId(courseId)
                                   .setCourseName(courseName)
                                   .setOnline(true)
                                   .build();
        
        // Berikan notifikasi kepada siswa setelah kursus baru dibuat
        courseNotifier.setMessage("New course " + courseName + " is now available!");
    }
}
