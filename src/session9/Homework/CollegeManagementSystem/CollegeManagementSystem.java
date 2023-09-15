package session9.Homework.CollegeManagementSystem;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class CollegeManagementSystem {

    public static void main(String[] args) {
        List<Students> student = new ArrayList<>();
        List<Professors> professors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        Students studentsOne = new Students("Smith", "Jhonson", "661 Goodwin Burg Suite 618", "1442211134", "26", 'M', LocalDate.of(1997, 2, 12));
        Students studentsTwo = new Students("Popescu", "Andrei", "Bd revolutie 1989", "19706541224", "25", 'M', LocalDate.of(1996, 5, 15));

        Professors professorsOne = new Professors("Bonner", "Paul", "1878900122", "Rego Park Queens 188", "45", 'M', LocalDate.of(1977, 12, 1));
        Professors professorsTwo = new Professors("Firu", "Mihai", "1965432002", "Bd Alexandru Obregia 23", "44", 'M', LocalDate.of(1978, 5, 14));

        Course courseOne = new Course("History", "History of America", "Every day", Duration.of(3, ChronoUnit.HOURS), professorsOne);
        Course courseTwo = new Course("English", "Learning English", "Every day", Duration.of(2, ChronoUnit.HOURS), professorsTwo);
        student.add(studentsOne);
        student.add(studentsTwo);

        professors.add(professorsOne);
        professors.add(professorsTwo);

        courses.add(courseOne);
        courses.add(courseTwo);

        for (Professors professor : professors) {
            System.out.println(professor);
        }

        for (Students students : student) {
            System.out.println(students);
        }

        for (Course course : courses) {
            System.out.println(course);
        }
    }
}