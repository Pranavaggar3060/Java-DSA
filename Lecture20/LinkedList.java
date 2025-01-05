package Lecture20;

public class LinkedList {
    class Node{
        int val;
        Node next;
    }
    Node head;
    // public LinkedList(){
    //     head=new Node();
    // }
    Node tail;
    private int size=0;

    //Addfirst: O(1)
    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            head=nn;
            tail=nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }
    public void addLast(int item){
        Node nn=new Node();
        nn.val=item;
        if(size==0){
            addFirst(item);
        }
        else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public Node getNode(int k){
        Node nn=head;
        for(int i=0;i<k;i++){
            nn=nn.next;
        }
        return nn;
    }
    public void addAtIndex(int item,int k){
        if(k==0)addFirst(item);
        else if(k==size)addLast(item);
        else{
            Node nn=new Node();
            nn.val=item;
            Node prev=getNode(k-1);
            nn.next=prev.next;
            prev.next=nn;
            size++;
        }
    }
    public int getFirst(){
        return head.val;
    }
    public int getLast(){
        return tail.val;
    }
    public int getIndex(int k){
        if(k<0 ||k>=size){
            return -1;
        }
        if(k==0)return getFirst();
        else if(k==size-1)return getLast();
        else return getNode(k).val;
    }
    public int removeFirst(){
        Node temp=head;
        head=head.next;
        temp.next=null;
        size--;
        return temp.val;
    }
    public int removeLast(){
        if(size==1)return removeFirst();
        else{
            Node temp=getNode(size-2);
            int rev=tail.val;
            temp.next=null;
            tail=temp;
            return rev;
        }
    }
    public int removeAtIndex(int k){
        if(k==0)return removeFirst();
        else if(k==size-1)return removeLast();
        else{
            Node prev=getNode(k-1);
            Node temp=prev.next;
            int rev = temp.val;
            prev.next=temp.next;
            temp.next=null;
            return rev;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NUll");
    }
}
