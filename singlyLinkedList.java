import java.util.*;
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data=data;
    }

}
public class SinglyLL{
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
    public void insertFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
             temp=temp.next;
        }
        temp.next=newNode;

    }
    public void insertAt(int searchData,int data){
        Node newNode=new Node(data);
        Node temp=head;
        if(head!=null && head.data==searchData){
            newNode.next=temp;
            head=newNode;
            return;
        }
        while(temp.next!=null){
            if(temp.next.data==searchData){
                newNode.next=temp.next;
                temp.next=newNode;
                return;
            }
            temp=temp.next;
        }
        System.out.println("No matching data found!!");
    }
    public void delete(int searchData){
        if(head!=null && head.data==searchData){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp!=null){
            if(temp.next.data==searchData){
                if(temp.next==tail){
                    tail=temp;
                    temp.next=null;
                }else{
                    temp.next=temp.next.next;
                    return;
                }
            }
            temp=temp.next;
        }
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("empty");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public int length(){
          if(head==null){
            return 0;
          }
          int count = 0;
          Node temp=head;
          while(temp!=null){
            count++;
            temp=temp.next;
          }
          return count;
    }
    public void reverse(){
        Node temp=head;
        Node prev=null;
        Node next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;
        }
        head=prev;
    }
    public void removeDuplicate(){
        Node temp=head;
        while(temp!=null){
            Node next = temp.next;
            while(next!=null && next.data==temp.data){
                next=next.next;
            }
            temp.next=next;
            if(next==tail && temp.data == next.data){
                tail=temp;
                tail.next=null;
            }
            temp=next;
        }
    }
    public static void main(String args[]){
        SinglyLL sll=new SinglyLL();
        Scanner input=new Scanner(System.in);

        int choice=0,temp;
        while(choice!=10){
            System.out.println("Enter 1 for add,2 for insert First,3 for insert last,4 for insertAt,5 for delete,6 for display,7 for length of sll,8 for reverse,9 remove duplicate,10 for exit");
            choice=input.nextInt();
            switch(choice){
                case 1:
                      System.out.println("Enter the num to add : ");
                      temp=input.nextInt();
                      sll.add(temp);
                      break; 
                case 2: 
                     System.out.println("Enter the num to insert first: ");
                     temp=input.nextInt();
                     sll.insertFirst(temp);
                     break;
                case 3:
                      System.out.println("Enter the element to insert last: ");
                      temp=input.nextInt();
                      sll.insertLast(temp);
                      break;
                case 4:
                    System.out.println("Enter where to insert: ");
                    temp=input.nextInt();
                    System.out.println("Enter the data to be inserted: ");
                    int data=input.nextInt();
                    sll.insertAt(temp,data);
                    break;
                case 5:
                     System.out.println("Enter the element to be deleted: ");
                     temp=input.nextInt();
                     sll.delete(temp);
                     break;

                case 6:
                    System.out.println("current elements are: ");
                    sll.display();
                    break;
                case 7:
                    System.out.println("Length is : "+sll.length());
                    break;
                case 8:
                    System.out.println("LL before reversing: ");
                    sll.display();
                    System.out.println("LL after reversing: ");
                    sll.reverse();
                    sll.display();
                    break;
                case 9:
                      sll.removeDuplicate();
                      System.out.println("after removing duplicates the elements are: ");
                      sll.display();
                      
                
            }  
        }
    }
}
