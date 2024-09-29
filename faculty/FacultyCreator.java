package faculty;

public class FacultyCreator {
    public static Faculty createFaculty(String type, String name) {
        if (type.equalsIgnoreCase("Lecturer")) {
            return new Lecturer(name);
        } else if (type.equalsIgnoreCase("Assistant")) {
            return new Assistant(name);
        }
        return null;
    }
}
