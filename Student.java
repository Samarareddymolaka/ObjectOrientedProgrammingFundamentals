/*
 * Part 1: Exploring the School System Project
Create a new Java project using Eclipse Idea.
Create a Student class. This class must have the following attributes:
   public class Student {
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
   }
Now, make the Student class implement the following methods:
   public void printFullName(){
      //TODO implement
   }

   public void isApproved(){
       //TODO implement: should return true if grade >= 60
   }

   public int changeYearIfApproved(){
       //TODO implement: the student should advance to the next year if he/she grade is >= 60
       // Make year = year + 1, and print "Congragulations" if the student has been approved
       return 0;
   }
Add constructors to your Student class:

Make the class with at least three different constructors.
Create a Java class for Courses

Your Course class must have, as attributes: courseName, professorName, year.
Your class must also contain a collection that lists all students enrolled in them.
Implement the following methods.
   public void enroll(Student student){
      //TODO add the student to the collection
   }

   public void unEnroll(Student student){
       //TODO remove this student from the collection
       // Hint: check if that really is this student
   }

   public int countStudents(){
       //TODO implement
       return 0;
   }
   
   public int bestGrade(){
       //TODO implement
       return 0;
   }
Run the main method and verify that your implementation works.

Method Overload:

Overload the enroll method to take in an array of students.
   public void enroll(Student[] students){
      //TODO add all the students to the collection
   }
Add on to the main method and call enroll with a list of students. Verify that your implementation works.
 */
package PracticeJavaOOP2;
import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Constructors
    public Student() {
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public void printFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations! You have been approved.");
        }
        return year;
    }
}

 class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> enrolledStudents;

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student student) {
        enrolledStudents.add(student);
    }

    public void unEnroll(Student student) {
        enrolledStudents.removeIf(s -> s.registration == student.registration);
    }

    public int countStudents() {
        return enrolledStudents.size();
    }

    public int bestGrade() {
        int best = 0;
        for (Student student : enrolledStudents) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }
 class Main{
    public static void main(String[] args) {
        // Testing Student class
        Student student1 = new Student("Samara", "Reddy", 123, 70, 2);
        student1.printFullName();
        System.out.println("Is Approved: " + student1.isApproved());
        System.out.println("Year after change: " + student1.changeYearIfApproved());

        // Testing Course class
        Course course = new Course("Java Programming", "Prof. teja", 2023);
        Student student2 = new Student("harsha", "Anji", 456, 85, 1);
        course.enroll(student1);
        course.enroll(student2);

        System.out.println("Number of students enrolled: " + course.countStudents());
        System.out.println("Best grade in the course: " + course.bestGrade());

        // Test enroll method with an array of students
        Student[] students = {new Student("Bobi", "Satya"), new Student("Kalyan", "gouse")};
        course.enroll(students);
        System.out.println("Number of students enrolled after array enroll: " + course.countStudents());
    }
}

 }
