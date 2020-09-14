public class Linkedlist {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int value){
            data = value;
            next = null;
        }

    }

    public void add(int data){
        Node new_node = new Node(data);
        if(this.head == null){
            this.head = new_node;
        }
        else{
            Node last;
            last = head;
            while(last.next!= null){
                last = last.next;

            }
            last.next = new_node;
        }
    }
    public void printlist(){
        Node element ;
        element = head;
        while(element != null){
            System.out.println(element.data);
            element = element.next;
        }

    }

    public static void main(String... args){
        Linkedlist ll = new Linkedlist();
        ll.add(8);
        ll.add(9);
        ll.add(100);
        ll.printlist();

    }
}

