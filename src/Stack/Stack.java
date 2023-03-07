package Stack;

import java.util.EmptyStackException;

class Stack<T> {
    class Node<T> {
        private T data; // data
        private Node<T> next; // next data

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    // 가장 위에 있는 데이터 가져오는 함수
    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    // 가장 위에 데이터 추가하는 함수
    public void push(T item) {
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }

    // 가장 위에 있는 데이터 확인
    public T peek(){
        if (top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }
    // 탑이 비어있는지 확인
    public boolean isEmpty() {
        return top == null;
    }


}
