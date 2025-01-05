package Lecture18;

public class OOPs {
    public static void main(String[] args) {
        // Classroom septBatch=new Classroom();//default constructor

    //     Instructor inst1 =new Instructor("Pranvav", "Java",007);

    // //     System.out.println(inst1.name+" "+inst1.subject+" "+inst1.code);

    //     Students stud=new Students("Lakshit", 71,"07",7.5f);

        Classroom c1=new Classroom();
        System.out.println(c1.inst);
        System.out.println(c1.students);
        System.out.println(c1.students[0]);
    }
}
