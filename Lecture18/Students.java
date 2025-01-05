package Lecture18;

public class Students {
    String name;
    String batch;
    int rollNo;
    String College;
    float cgpa;
    String Classroom_code;

    public Students(){
        this.name="Pranav";
        this.rollNo=18;
        this.Classroom_code="xyz";
        this.cgpa=8.57f;
    }
    public Students(
            String n,
            int no,
            String code,
            float cgpa
        ){
        this.name=n;
        this.rollNo=no;
        this.Classroom_code=code;
        this.cgpa=cgpa;
    }
}
