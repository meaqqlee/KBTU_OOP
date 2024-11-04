package Labs.Lab1.Task4.GradeBook;

import Labs.Lab1.Task4.Course.Course;
import Labs.Lab1.Task4.Student.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<Student>();
        this.grades = new HashMap<Student, Integer>();
    }

    public void addStudent(Student student, int grade) {
        students.add(student);
        grades.put(student, grade);
    }

    public String displayMessage() {
        return "Welcome to the grade book for " + course.getName();
    }

    public void displayGradeReport() {
        System.out.println("\nClass average is " + determineClassAverage());
        System.out.println("Lowest grade is " + findLowestGrade());
        System.out.println("Highest grade is " + findHighestGrade());
        outputBarChart();
    }

    public double determineClassAverage() {
        int total = 0;
        for(int grade : grades.values()) {
            total += grade;
        }
        return (double) total / grades.size();
    }

    public String findLowestGrade() {
        int min = Integer.MAX_VALUE;
        Student minStudent = null;
        for(Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if(entry.getValue() < min) {
                min = entry.getValue();
                minStudent = entry.getKey();
            }
        }
        return min + "(Student " + minStudent.getName() +", id: " + minStudent.getId() + ")";
    }

    public String findHighestGrade() {
        int max = Integer.MIN_VALUE;
        Student maxStudent = null;
        for(Map.Entry<Student, Integer> entry : grades.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                maxStudent = entry.getKey();
            }
        }
        return max + "(Student " + maxStudent.getName() +", id: " + maxStudent.getId() + ")";
    }

    public void outputBarChart() {
        int[] frequency = new int[11];
        for(int grade : grades.values()) {
            ++frequency[grade / 10];
        }

        System.out.println("\nGrade distribution:");
        for(int i = 0; i < frequency.length; i++) {
            if(i == 10) {
                System.out.print(" 100: ");
            }
            else {
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);
            }

            for(int stars = 0; stars < frequency[i]; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
