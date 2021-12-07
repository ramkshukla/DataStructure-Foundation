class Stack{
    int stack[]  = new int[20];
    int tos;
    Stack(){
        this.tos = -1;
    }

    public void push(int val){
        if (tos == 9){
            System.out.println("Stack is full");
            return;
        }
        else{
            stack[++tos] = val;
        }
    }

    public int pop(){
        if (tos < 0){
            System.out.println("Stack is empty");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
}

public class SA {
    public static void main(String[] args){
        Stack st = new Stack();
        for(int i=0; i<10; i++){
            st.push(i);
        }
        for(int i=0; i<10; i++){
            System.out.print(st.pop() + " ");
        }
    }
}
