package students;
import courses.Course;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentId;
    private ArrayList<Course> enrolledCourses;
    private Transcript transcript;
    private boolean isHonorRoll;

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourses = new ArrayList<>();
        this.transcript = new Transcript();
        this.isHonorRoll = false;
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }

    public void completeCourse(Course course, double grade) {
        if (enrolledCourses.contains(course)) {
            transcript.addCourse(course, grade);
            enrolledCourses.remove(course);
            System.out.println(name + " completed " + course.getCourseName() + " with grade " + grade);
        } else {
            System.out.println("Student not enrolled in the course.");
        }
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public void addHonorRollStatus() {
        this.isHonorRoll = true;
    }

    public boolean isHonorRoll() {
        return isHonorRoll;
    }

    public String getStudentId() { return studentId; }

    public String getName() { return name; }
}
