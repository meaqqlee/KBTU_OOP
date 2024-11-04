package Labs.Lab1.Task4;

import Labs.Lab1.Task4.Course.Course;
import Labs.Lab1.Task4.GradeBook.GradeBook;
import Labs.Lab1.Task4.Student.Student;

import java.util.Arrays;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
        Course course = new Course("CS101 Object-oriented Programming and Design",
                "Introduction to OOP", 4, Arrays.asList("CS100"));

        GradeBook gradeBook = new GradeBook(course);

        gradeBook.displayMessage();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input grades for students:");

        Student student1 = new Student("Student A");
        System.out.print("Student A: ");
        int grade1 = scanner.nextInt();
        gradeBook.addStudent(student1, grade1);

        Student student2 = new Student("Student B");
        System.out.print("Student B: ");
        int grade2 = scanner.nextInt();
        gradeBook.addStudent(student2, grade2);

        Student student3 = new Student("Student C");
        System.out.print("Student C: ");
        int grade3 = scanner.nextInt();
        gradeBook.addStudent(student3, grade3);

        Student student4 = new Student("Student D");
        System.out.print("Student D: ");
        int grade4 = scanner.nextInt();
        gradeBook.addStudent(student4, grade4);

        Student student5 = new Student("Student E");
        System.out.print("Student E: ");
        int grade5 = scanner.nextInt();
        gradeBook.addStudent(student5, grade5);

        Student student6 = new Student("Student F");
        System.out.print("Student F: ");
        int grade6 = scanner.nextInt();
        gradeBook.addStudent(student6, grade6);

        Student student7 = new Student("Student G");
        System.out.print("Student G: ");
        int grade7 = scanner.nextInt();
        gradeBook.addStudent(student7, grade7);

        gradeBook.displayGradeReport();
    }
}
