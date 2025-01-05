package Lecture21;

public class Implement {
    public static void main(String[] args) {
        STK stk=new STK();
        //8 1 7 2 3
        stk.push(3);
        stk.push(2);
        stk.push(7);
        stk.push(1);
        stk.push(8);
        stk.print();
        stk.pop();
        System.out.println(stk.pop());
        stk.print();
        stk.size();

    }
}
