Part 1: Exploring the School System Project
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
Challenge yourself
Implement a function that calculates the average grade for that course.
Implement a function that outputs a ranking with all students enrolled in a course and respective grades.
Implement a function that, for each student, show if he/she is above course average or not.
