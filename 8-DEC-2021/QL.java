class Queue{
    Node front, rear;
    Queue(){
        front=rear=null;
    }
    public void enqueue(int val){
        Node temp = new Node(val);
        if (rear == null){
            front=rear=temp;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    public void dequeue(){
        if (front == null){
            return;
        }
        front = front.next;
    }
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
}

public class QL {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(q.front.data);
        System.out.println(q.rear.data);
        q.dequeue();
        System.out.println(q.front.data);
        System.out.println(q.rear.data);
        

    }
}
