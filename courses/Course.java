package courses;

import java.util.ArrayList;

public class Course implements CourseComponent{
    private String courseId;
    private String courseName;
    private boolean isOnline;
    private String location;
    private ArrayList<CourseComponent> prerequisites;

    public Course(String courseId, String courseName, boolean isOnline, String location, ArrayList<CourseComponent> prerequisites) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.isOnline = isOnline;
        this.location = location;
        this.prerequisites = prerequisites;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public void showCourseDetails() { // Menampilkan detail course yang mau diambil beserta syarat pengambilan course
        System.out.println("Course: " + courseName + 
                           ", Online: " + (isOnline ? "Yes" : "No") + 
                           ", Location: " + location);
        if (!prerequisites.isEmpty()) {
            System.out.println("Prerequisites for " + courseName + ":");
            for (CourseComponent prerequisite : prerequisites) {
                prerequisite.showCourseDetails();
            }
        }
    }
}

interface  CourseComponent{ // Interface yang berisi operasi yang dipakai oleh Course dan CourseGroup 
    void showCourseDetails();
}

class CourseGroup implements CourseComponent{
    // Class untuk menyimpan, menghapus dan menampilkan daftar objek CourseComponent
    private ArrayList<CourseComponent> courseList = new ArrayList<>();
    private String groupName;

    public CourseGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addCourse(CourseComponent course) {
        courseList.add(course);
    }

    public void removeCourse(CourseComponent course) {
        courseList.remove(course);
    }

    @Override
    public void showCourseDetails() {
        System.out.println("Course Group: " + groupName);
        for (CourseComponent course : courseList) {
            course.showCourseDetails();
        }
    }
}
