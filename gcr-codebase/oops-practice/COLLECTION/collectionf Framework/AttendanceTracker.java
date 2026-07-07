package COLLECTION;

import java.util.ArrayList;
import java.util.HashMap;

public class AttendanceTracker {

    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    public static void markAttendance(String subject, String student) {

        attendance.putIfAbsent(subject, new ArrayList<>());

        ArrayList<String> students = attendance.get(subject);

        if (students.contains(student)) {
            System.out.println(student + " is already marked in " + subject);
        } else {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        }
    }

    public static void displayAttendance() {

        System.out.println();

        for (String subject : attendance.keySet()) {

            ArrayList<String> students = attendance.get(subject);

            System.out.println("Subject : " + subject);

            for (String student : students) {
                System.out.println(student);
            }

            System.out.println("Total Students : " + students.size());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        markAttendance("Java", "Rahul");
        markAttendance("Java", "Aman");
        markAttendance("Java", "Rahul");

        markAttendance("Python", "Priya");
        markAttendance("Python", "Rahul");

        displayAttendance();
    }
}