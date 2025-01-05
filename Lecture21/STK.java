package Lecture21;

public class STK {
    static int size=0;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public STK(){
        this.head=null;
    }
    //isEmpty()
    public boolean isEmpty(){
        return head==null;
    }
    //push(5)
    public void push(int data){
        Node nn=new Node(data);
        if(head==null){
            head=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    //pop()=>5
    public int pop(){
        if(head==null)return -1;
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
        return temp.data;
    }
    //peek()=>top
    public int peek(){
        if(head==null)return -1;
        else return head.data;
    }
    //print stack
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    //size()=>HomeWork
    public void size(){
        System.out.println(size);
    }
}
