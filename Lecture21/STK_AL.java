package Lecture21;

import java.util.ArrayList;

public class STK_AL {
    private ArrayList<Integer> str = new ArrayList<Integer>();

    //isEmpty();
    public boolean isEmpty(){
        return str.size()==0;
    }
    //push(5)
    public void push(int data){
        str.add(data);
    }
    //pop()=>5
    public int pop(){
        if(isEmpty())return-1;
        int lasti=str.get(str.size()-1);
        str.remove(str.size()-1);
        return lasti;
    }
    //peek()=>top
    public int peek(){
        if(isEmpty())return -1;
        else return str.get(str.size()-1);
    }
    //print stack
    public void print(){
        if (isEmpty()) {
            return;
        }
        for(int i=str.size()-1;i>=0;i--){
            System.out.print(str.get(i)+"->");
        }
        System.out.println("NULL");
    }
}
