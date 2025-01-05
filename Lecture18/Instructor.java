package Lecture18;

public class Instructor {
    String name;
    int code;
    String subject;

    //constructor
    public Instructor(){
        this.name="John Doe";
        this.code=-1;
        this.subject="C++";
    }
    public Instructor(String n,String s,int c){
        this.name=n;
        this.subject=s;
        this.code=c;
    }
}
