package paradigms;
import paradigms.classes.Student;

// compile from toplevel folder that has all the packages
// compile from nov9 folder, not nov9/paradigms or nov9/paradigms/classes

// run command                  javac paradigms/*.java paradigms/classes/*.java
// then run command:            java paradigms.StudentApp

public class StudentApp{

    // main method, program's entrypoint
    public static void main (String [] args){
        // creates an instance of the Student Class
        Student s = new Student("Mark", new String [] {"A","B","C"});
        // computes GPA
        float gpa = s.computeGPA();

        System.out.println(s.getName() + ". gpa = " + gpa);
    }
}