package Lec25_Streams;

public class Student {
    private String id;
    private double gpa;

    public Student(String id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + " GPA: " + gpa;
    }
}
