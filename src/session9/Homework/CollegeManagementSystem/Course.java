package session9.Homework.CollegeManagementSystem;


import java.time.Duration;

public class Course {
    private String courseTitle;
    private String courseDescription;
    private String courseSchedule;
    private Duration courseDuration;
    private Professors courseAssignedProfessor;

    public Course(String courseTitle, String courseDescription, String courseSchedule, Duration courseDuration, Professors courseAssignedProfessor) {
        this.courseTitle = courseTitle;
        this.courseDescription = courseDescription;
        this.courseSchedule = courseSchedule;
        this.courseDuration = courseDuration;
        this.courseAssignedProfessor = courseAssignedProfessor;
    }

    public void setProfessor() {
        this.courseAssignedProfessor = courseAssignedProfessor;
    }

    public String toString() {
        return "Course name: " + courseTitle + ", description: " + courseDescription + ", schedule: " + courseDescription + ", duration: " + courseDuration.toString() + ", assignedProfessor: " + courseAssignedProfessor.toString();
    }
}