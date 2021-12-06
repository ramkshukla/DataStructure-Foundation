class SLL{
    Node head;
    Node tail;
    int size;
    SLL(){
        this.size = 0;
    }

    public void insertAtLast(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
        }
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    public void MiddleElement(){
        Node slow_ptr = head;
        Node fast_ptr = head;
        while(fast_ptr!=null && fast_ptr.next!=null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        System.out.println("The Middle element " + slow_ptr.data + " ");
    }

    public int countOfNode(){
        Node temp = head;
        int count=0;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public void deleteMiddle(){
        if (head == null){
            return;
        }
        if (head.next == null){
            return;
        }
        Node temp = head;
        int count = countOfNode();
        int mid = count/2;
        while(mid-- > 1){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }


// 1->1->2->2->3->4->5->6->END
// 
    public void removeDuplicate(){
        Node temp = head;
        while(temp!=null){
            Node curr = temp;
            while(curr!=null && curr.data == temp.data){
                curr = curr.next;
            }
            temp.next = curr;
            temp = temp.next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
        }
        Node(int val, Node next){
            this.data = val;
            this.next = next;
        }
    }
}
public class MSLL {
    public static void main(String[] args){
        SLL sll = new SLL();
        sll.insertAtLast(1);
        sll.insertAtLast(1);
        sll.insertAtLast(2);
        sll.insertAtLast(2);
        sll.insertAtLast(3);
        sll.insertAtLast(4);
        sll.insertAtLast(5);
        sll.insertAtLast(6);
        sll.MiddleElement();
        sll.display();
        sll.removeDuplicate();
        // sll.deleteMiddle();
        sll.display();
    }
}
