//Implementation of circular linked list
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data=data;
    }
}
public class CircularLL {
    public Node head;
    public Node tail;

    public void addNode(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }else{
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty");
        }else{
            System.out.println("Nodes of circulat ll: ");
            System.out.println(" "+temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        CircularLL cl=new CircularLL();
        
        int n;
        System.out.println("Enter the num of nodes: ");
        n=input.nextInt();
        System.out.println("Enter the nodes: ");
        int temp=input.nextInt();
        cl.addNode(temp);

        cl.display();

    }
    
}
