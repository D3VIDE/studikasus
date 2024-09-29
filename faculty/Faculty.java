package faculty;


import courses.Course;
public abstract class Faculty {
    protected String name;


    public Faculty(String name) {
        this.name = name;
    }
    public final void assignToCourse(Course course) {
        assignRole(course);  
        confirmAssignment();
    }
    protected abstract void assignRole(Course course);


  
    protected void confirmAssignment() {
        System.out.println("Assignment confirmed.");
    }
}
