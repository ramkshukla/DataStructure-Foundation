class Stack{
    Node top;
    Stack(){
        this.top = null;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){
        if(!isEmpty()){
            return top.data;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }
    }
    public void push(int val){
        Node node = new Node(val);
        node.next = top;
        top = node;
    }

    public void pop(){
        if (top == null){
            System.out.println("Heap Underflow");
        }
        else{
            top = top.next;
        }
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

    }
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
    }
}
public class SL {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.display();
        stack.pop();
        stack.display();
        System.out.println(stack.top.data);

    }
}
