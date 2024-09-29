package courses;

import java.util.ArrayList;

public class CourseCreator {
    private String courseId;
    private String courseName;
    private boolean isOnline;
    private String location;
    private ArrayList<CourseComponent> prerequisites = new ArrayList<>();

    public CourseCreator setCourseId(String courseId) {
        this.courseId = courseId;
        return this;
    }

    public CourseCreator setCourseName(String courseName) {
        this.courseName = courseName;
        return this;
    }

    public CourseCreator setOnline(boolean isOnline) {
        this.isOnline = isOnline;
        return this;
    }

    public CourseCreator setLocation(String location) {
        this.location = location;
        return this;
    }

    public CourseCreator setPrerequisites(ArrayList<CourseComponent> prerequisites) {
        this.prerequisites = prerequisites;
        return this;
    }

    public Course build() {
        return new Course(courseId, courseName, isOnline, location, prerequisites);
    }
}
