package faculty;

import courses.Course;

public class Assistant extends Faculty {

    public Assistant(String name) {
        super(name);
    }

    @Override
    public void assignRole(Course course) {
        System.out.println("Assistant " + name + " assigned to assist " + course.getCourseName());
    }
}



