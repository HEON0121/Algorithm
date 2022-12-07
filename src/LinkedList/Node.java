package LinkedList;

// singleLinkedList
// 단방향 노드
public class Node {

        int data;
        Node next = null;
        Node(int data) {
            this.data = data;
        }

        void append(int data) {
            Node end = new Node(data);
            Node n = this;
            while(n.next != null) {
                n = n.next;
            }
            n.next = end;
        }

        void delete(int data) {
            Node n = this;
            while(n.next != null){
                if(n.next.data == data){
                    n.next = n.next.next;
                }else{
                    n = n.next;
                }
            }
        }

        void retrieve() {
            Node n = this;
            while(n.next != null) {
                System.out.print(n.data + ", ");
                n = n.next;
            }
            System.out.println(n.data);
        }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.append(1);
        n.append(2);
        n.append(3);
        n.append(5);
        n.retrieve();
        n.delete(1);
        n.delete(5);
        n.retrieve();
    }

}
