package Lecture18;

public class Classroom {
    Instructor inst;
    Students[] students;// Declaration

    //Constructors
    //custom default constructor
    public Classroom(){
        // System.out.println("A new Classroom is created");
        inst=new Instructor();
        students=new Students[4];
        
    }
}
