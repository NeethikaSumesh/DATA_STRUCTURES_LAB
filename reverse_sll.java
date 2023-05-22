//reverse a singly linked list
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node (int data){
        this.data=data;
    }
}
public class ReverseSLL {
    public Node head;
    public Node tail;
    
    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;

    }
    public void reverse(){
        Node temp=head;
        Node next=null;
        Node prev=null;

        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    public void display(){
        if(head==null){
            System.out.println("Empty");
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        ReverseSLL rl=new ReverseSLL();

        int n;
        System.out.println("Enter the num of nodes: ");
        n=input.nextInt();
        
        System.out.println("Enter the nodes: ");
        for(int i=0;i<n;i++){
            int temp=input.nextInt();
            rl.addNode(temp);
        }
        System.out.println("List: ");
        rl.display();
        
        rl.reverse();

        System.out.println("After reversal:  ");
        rl.display();
    }
    
}
