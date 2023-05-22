import java.lang.*;

class Node{
   public Node left;
   public Node right;
   public Node parent;
   public int data;
    Node(int data){
        this.data = data;
    }
}

public class BSTree {
    public Node root;

    public void addNode(int data){
        Node newNode = new Node(data);
      if(root == null){
          root = newNode;
          return;
      }
      Node temp = root;
      
      while(temp!=null){
          
          if(newNode.data<=temp.data){
              if(temp.left == null){
                  temp.left = newNode;
                  newNode.parent = temp;
                  return;
              }
              temp = temp.left;
          }
          else if(newNode.data>temp.data){
              if(temp.right == null){
                  temp.right = newNode;
                  newNode.parent = temp;
                  break;
              }
              temp=temp.right;
            }   
      }
    }
    public void preOrder(){
        System.out.println("Pre-Order");
        preOrderHelper(root);
 
    }
 
    private void preOrderHelper(Node temp){
        if(temp!=null){
         System.out.println(temp.data);
         preOrderHelper(temp.left);
         preOrderHelper(temp.right);
 
        }
        
    }
 
    public void postOrder(){
        System.out.println("Post-Order");
        postOrderHelper(root);
    }
    public void postOrderHelper(Node temp){
        if(temp!=null){
            postOrderHelper(temp.left);
            postOrderHelper(temp.right);
            System.out.println(temp.data);
        }
    }
 
 public void inOrder(){
      System.out.println("In-Order");
     inOrderHelper(root);
 }
 public void inOrderHelper(Node temp){
     if(temp!=null){
         inOrderHelper(temp.left);
         System.out.println(temp.data);
         inOrderHelper(temp.right);
         
     }
 }
 public static void main(String[] args) {
    BSTree obj = new BSTree();
    obj.addNode(10);
    obj.addNode(5);
    obj.addNode(15);
    obj.addNode(99);
    obj.addNode(13);
    obj.addNode(14);
    obj.addNode(16);
    obj.addNode(4);
    obj.addNode(7);
    obj.addNode(6);
    obj.inOrder();
   
}

}
