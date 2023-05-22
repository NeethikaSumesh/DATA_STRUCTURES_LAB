//Delete every second element of the list
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data=data;
    }
}
public class SecondDelete{
    public Node head;
    public Node tail;

    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }else{
            tail.next=newNode;
        }
        tail=newNode;
    }
    public void delete(){
        Node temp=head;
        while(temp!=null){
            if(temp.next!=null){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
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
        SecondDelete sd= new SecondDelete();
        Scanner input =new Scanner(System.in);
        int choice=0,temp;
        while(choice!=4)
        {
            System.out.println("Enter 1 for add,2 for display,3 for delete,4 for exit ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the num to add: ");
                    temp=input.nextInt();
                    sd.add(temp);
                    break;
                case 2:
                    System.out.println("the elements are: ");
                    sd.display();
                    break;
                case 3:
                    System.out.println("After deleting ");
                    sd.delete();
                    sd.display();
                    break;
                
            }
        }
    }
}
