package Queue;

import java.util.Stack;

// 스택 두 개로 큐 구현
class MyQueue<T> {
    Stack<T>stackNewest, stackOldest;
    MyQueue(){
        stackNewest = new Stack<>();
        stackOldest = new Stack<>();
    }
    //현재 데이터가 얼마나 쌓였는지 보여줄 함수
    public int size(){
        return stackNewest.size() + stackOldest.size();
    }
    public void add(T value){
        stackNewest.push(value);
    }
    private void shiftStacks(){
        if(stackOldest.isEmpty()){
            while(!stackNewest.isEmpty()){
                stackOldest.push(stackNewest.pop());
            }
        }
    }
    public T peek() {
        shiftStacks();
        return stackOldest.peek();
    }
    public T remove() {
        shiftStacks();
        return stackOldest.pop();
    }

}
// 스택 2개로 큐 구현 하기
class Test {
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
