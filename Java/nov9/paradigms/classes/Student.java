package paradigms.classes;

// run javac *.java to compile all java 
public class Student {
    // Strings are objects 
    // chars are primitives, therefore the '==' would work 
    private String name;
    private String [] grades;

    public Student(String name, String [] grades){
        this.name   = name;
        this.grades = grades;
    }

    public String getName(){
        return this.name;
    }

    public float computeGPA(){
        float sum = 0;
        for (int i = 0; i < grades.length; i ++) {
            //strings are objects not primitives
            // the '==' when used on strings tests if the object 
            // the .equals will check the values 
            String letterGrade = grades[i];
            if(letterGrade.equals("A")) sum += 4;
            if(letterGrade.equals("A-")) sum += 3.667;
            if(letterGrade.equals("B+")) sum += 3.333;
            if(letterGrade.equals("B")) sum += 3;
            if(letterGrade.equals("B-")) sum += 2.667;
            if(letterGrade.equals("C+")) sum += 2.333;
            if(letterGrade.equals("C")) sum += 2;
            if(letterGrade.equals("C-")) sum += 1.667;
            if(letterGrade.equals("D")) sum += 1;
        }
        return sum/grades.length;
    }
}