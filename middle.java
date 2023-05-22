//odd-print the middle element
//even-print the average of middle 2 terms
import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data=data;
    }
}
public class Middle{
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
    public int length(){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void middleFinder(){
        float avg,next;
        Node temp=head;

        if(length()%2!=0){
            for(int i=1;i<(length()+1)/2;i++){
                temp=temp.next;
            }
            System.out.println("Midle element is: "+temp.data);
        }else{
            for(int i=1;i<(length()/2);i++){
                temp=temp.next;
            }
            avg=temp.data;
            next=temp.next.data;
            avg = (next+avg)/2;
            System.out.println("Middle element is: "+avg);
        }
    }
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        Middle ml=new Middle();
        int n;
        System.out.println("how many elements do you want to enter: ");
        n=input.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            int temp=input.nextInt();
            ml.add(temp);
        }
        ml.middleFinder();
    }
}
