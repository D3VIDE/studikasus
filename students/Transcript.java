package students;

import courses.Course;

import java.util.HashMap;

public class Transcript {
    private HashMap<Course, Double> completedCourses;
    private double gpa;

    public Transcript() {
        this.completedCourses = new HashMap<>();
    }

    public void addCourse(Course course, double grade) {
        completedCourses.put(course, grade);
        updateGPA();
    }

    private void updateGPA() {
        double totalGrades = 0;
        for (double grade : completedCourses.values()) {
            totalGrades += grade;
        }
        gpa = totalGrades / completedCourses.size();
        System.out.println("GPA updated to " + gpa);
    }

    public double getGPA() {
        return gpa;
    }
}

