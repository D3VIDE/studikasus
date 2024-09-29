package Notifw;

public class StudentNotifier implements Notifw.Observer {
    private String studentName;

    public StudentNotifier(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + studentName + ": " + message);
    }

    @Override
    public String toString() {
        return studentName;
    }
}
