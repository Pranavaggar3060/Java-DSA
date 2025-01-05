package Lecture21;

public class Implement2 {
    public static void main(String[] args) {
        STK_AL stk=new STK_AL();
        stk.push(10);
        stk.push(20);
        stk.push(30);

        stk.print(); 

        System.out.println(stk.peek());
        System.out.println(stk.pop()); 

        stk.print();
    }
}
