package faculty;

import courses.Course;

public class Lecturer extends Faculty {

    public Lecturer(String name) {
        super(name);
    }

    @Override
    public void assignRole(Course course) {
        System.out.println("Lecturer " + name + " assigned to teach " + course.getCourseName());
    }
}

