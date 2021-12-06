// [1,2,3,4,5,6];
//  ^         ^
// front      rear

class Queue{
    int front, rear, capacity;
    int queue[];

    Queue(int c){
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    public void queueEnqueue(int data){
        if (capacity == rear){
            System.out.println("Queue is full");
            return;
        }
        else{
            queue[rear] = data;
            rear++;
        }
    }

    public void queueDequeue(){
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
    }
    public void queueDisplay(){
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front; i<rear; i++){
            System.out.print(queue[i] + " ");
        }
        return;
    }

    public void queuefront(){
        if (front == rear){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front element is %d " + queue[front]);
        return;
    }
}
public class QArray {
    public static void main(String[] args){
        Queue q = new Queue(10);
        q.queueEnqueue(20);
        q.queueEnqueue(30);
        q.queueEnqueue(40);
        q.queueEnqueue(50);
        q.queueDisplay();
        q.queueEnqueue(60);
        System.out.println();
        q.queueDequeue();
        System.out.println();
        q.queueDisplay();
        q.queueEnqueue(70);
        System.out.println();
        q.queueDisplay();
        q.queueDequeue();
        System.out.println();
        q.queueDisplay();




    }
}
