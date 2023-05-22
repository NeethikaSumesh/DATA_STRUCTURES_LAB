import java.util.Scanner;

class Node
{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data = data;
    }
}

public class DoublyLinkedList 
{
   public Node head;
   public Node tail;

   public  void addNode(int data) 
   {
       Node newNode = new Node(data);
   if(head == null){
       head = newNode;
       

   }
   else{
       tail.next = newNode;
       newNode .prev = tail;
      
       
   }
   tail = newNode;
   
   }
   public void displayForward()
   {
       if(head == null){
           System.out.println("empty");
           return;
       }
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }

   }
   public void displayBackward()
   {
    if(head == null){
        System.out.println("empty");
        return;
    }
    Node temp = tail;
    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.prev;
    }

}


   
   public void delete(int data)
   {
       Node temp = head;
       if(head.data == data)
       {
           head = temp.next;
           head.prev = null;
           return;
       }
       while(temp!=null)
       {

         if(temp.data == data)
         {
            if(temp == tail)
            {
                tail = temp.prev;
                tail.next = null;
            }
             else 
             {
                 temp.prev.next = temp.next;
                 temp.next.prev = temp.prev;
            }
            
             return;
         }
         temp = temp.next;

       }
       System.out.println("No matching data found");
    }
   
   public void insert(int searchData, int data)
   {
       Node newNode = new Node(data);
       Node temp = head;
       if(head.data == searchData)
       {
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
           return;
           
       }
       while(temp!=null)
       {
           if(searchData == temp.data)
           {
               newNode.next = temp;
               temp.prev.next = newNode;
               newNode.prev = temp.prev;
               temp.prev = newNode;

               return;

           }
           temp = temp.next;
       }
       System.out.println("No matching data found");
   }
   
   public static void main(String[] args) 
   {
       DoublyLinkedList dl = new DoublyLinkedList();
       Scanner input = new Scanner(System.in);
       
       int choice=0,temp;
        while(choice!=6){
            System.out.println("Enter 1 To Add, 2 For Delete, 3 To Insert At, 4 For Displaying Forward, 5 For Displaying Backward, 6 for Exit: ");
            choice = input.nextInt();
            switch(choice){
                
                case 1: System.out.println("Enter number to Add");
                temp = input.nextInt();
                dl.addNode(temp);
                break;

                case 2: System.out.println("Enter the element to be Deleted: ");
                        temp = input.nextInt();
                        dl.delete(temp);
                        break;

                case 3: System.out.println("Enter where to Insert: ");
                        temp = input.nextInt();
                        System.out.println("Enter the Element to be Inserted: ");
                        int data = input.nextInt();
                        dl.insert(temp, data); 
                        break;

                case 4: System.out.println("Elements in forward direction: ");
                        dl.displayForward();
                        break;
                
                case 5: System.out.println("Elements in backward direction:"); 
                        dl.displayBackward();       
            }   

        }
        input.close();
   }
}
