class Queue{
    int front, rear, capacity;
    int queue[];
    Queue(int c){
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void enqueue(int data){
        if (capacity == rear){
            System.out.println("List is full");
            return;
        }
        else{
            queue[rear] = data;
            rear++;
        }
    }

    public void dequeue(){
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=0; i<rear-1; i++){
                queue[i] = queue[i+1];
            }
            if (rear < capacity){
                queue[rear] = 0;
            }
            rear--;
        }
        return;
    }
    public void front(){
        System.out.println(queue[front]);
    }

    public void display(){
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front; i<rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

public class QA {
    public static void main(String[] args){
        Queue q = new Queue(10);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(6);
        q.display();
        q.front();
    }
}
