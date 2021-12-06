class Queue{
    QNode front, rear;

    Queue(){
        this.front = this.rear = null;
    }

    class QNode{
        int data;
        QNode next;

        public QNode(int key){
            this.data = key;
            this.next = null;
        }
    }


    public void enqueue(int key){
        QNode temp = new QNode(key);
        if (this.rear == null){
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    public void dequeue(){
        if (this.front == null){
            return;
        }
        // QNode temp =this.front;
        this.front = this.front.next;
        if (this.front == null){
            this.rear = null;
        }
    }
}
public class LLQueue {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        System.out.println(q.front.data);
        System.out.println(q.rear.data);

    }
}
