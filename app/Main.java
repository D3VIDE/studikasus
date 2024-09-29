package app;

import courses.Course;
import courses.CourseCreator;
import courses.CourseManager;
import enrollment.EnrollStudent;
import enrollment.Base;
import exports.ExportService;
import exports.JsonExportService;
import students.Student;
import Notifw.CourseNotifier;
import Notifw.StudentNotifier;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExportService exportService = new JsonExportService();
        CourseNotifier courseNotifier = new CourseNotifier();
        CourseCreator courseCreator = new CourseCreator();

        System.out.println("Masukkan nama siswa:");
        String studentName = scanner.nextLine();
        System.out.println("Masukkan ID siswa:");
        String studentId = scanner.nextLine();


        Student mainstudent = new Student(studentName, studentId);

        System.out.println("Masukkan jumlah siswa yang akan menerima notifikasi:");
        int numStudents = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < numStudents; i++) {
            System.out.println("Masukkan nama siswa ke-" + (i + 1) + ":");
            StudentNotifier student = new StudentNotifier(studentName);
            courseNotifier.addObserver(student);
        }


        System.out.println("Masukkan ID kursus:");
        String courseId = scanner.nextLine();
        System.out.println("Masukkan nama kursus:");
        String courseName = scanner.nextLine();


        CourseManager courseManager = new CourseManager(courseCreator, courseNotifier);


        courseManager.createNewCourse(courseId, courseName);


        System.out.println("1. Enroll in Course");
        System.out.println("2. Complete Course");
        System.out.println("3. Export Transcript");


        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter course type (1 for Online, 2 for Onsite): ");
                int courseType = scanner.nextInt();
                Course course;
                if (courseType == 1) {
                    course = courseManager.constructOnlineCourse("CS101", "Intro to CS");
                } else {
                    System.out.println("Enter location for the onsite course: ");
                    String location = scanner.next();
                    course = courseManager.constructOnsiteCourse("CS101", "Intro to CS", location);
                }

                Base enrollCommand = new EnrollStudent(mainstudent, course);
                enrollCommand.execute();
                break;
            case 2:
                System.out.println("Enter grade for the course: ");
                double grade = scanner.nextDouble();
                mainstudent.completeCourse(courseCreator.build(), grade);  // Complete the course using builder
                break;
            case 3:
                String transcript = exportService.exportTranscript(mainstudent.getTranscript());
                System.out.println("Exported Transcript: " + transcript);
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}



