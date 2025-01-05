package Lecture20;

public class Implementation {
    static LinkedList merge(LinkedList list1,LinkedList list2){
        return list1;
    }
    private LinkedList getMiddle(LinkedList head) {
        if (head == null) {
            return null;
        }

        LinkedList tort = head;
        LinkedList hare = head;

        while (hare.next != null && hare.next.next != null) {
            tort = tort.next;
            hare = hare.next.next;
        }

        return tort;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();

        ll.addFirst(3);
        ll.addFirst(6);
        ll.addFirst(2);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(1);
        ll.display();
    }
}
