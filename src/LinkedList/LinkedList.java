package LinkedList;

public class LinkedList {
    Node header;
    static class Node {
        int data;
        Node next = null;
    }
    LinkedList() {
        header = new Node();
    }

    void append(int data) {
        Node end = new Node();
        end.data = data;
        Node n = header;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    void delete(int data) {
        Node n = header;
        while(n.next != null){
            if(n.next.data == data){
                n.next = n.next.next;
            }else{
                n = n.next;
            }
        }
    }

    void retrieve() {
        Node n = header.next;
        while(n.next != null) {
            System.out.print(n.data + "->");
            n = n.next;
        }
        System.out.println(n.data);
    }

    // remove 중복
    void removeDups() {
        Node n = header;
        while(n!=null && n.next != null) {
            Node runner = n;
            while (runner.next != null) {
                if(n.data == runner.next.data) {
                    runner.next = runner.next.next;
                }else {
                    runner = runner.next;
                }
            }
            n = n.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(3);
        list.append(5);
        list.append(7);
        list.append(1);
        list.append(3);
        list.append(5);
        list.append(7);
        list.retrieve();
//        list.delete(7);
//        list.retrieve();
        list.removeDups();
        list.retrieve();
    }
}
