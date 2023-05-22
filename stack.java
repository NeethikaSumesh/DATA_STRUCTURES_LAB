public class Stack_Implementation {
    int size,arr[],top;
    public Stack_Implementation(int size){
        this.size=size;
        this.arr=new int[size];
        this.top=-1;
    }
    public boolean isFull(){
        return(size-1==top);
    }
    public boolean isEmpty(){
        return(top==-1);
    }
    public int peek(){
        return arr[top];
    }
    public void push(int num){
        if(!isFull()){
            arr[++top] = num;
            System.out.println("Element pushed" + num);
        }else{
            System.out.println("Stack is full:Overflow");
        }
    }
    public int pop(){
        if(!isEmpty()){
            int val = arr[top];
            top--;
            System.out.println("Popped element is" + val);
            return val;
        }else{
            System.out.println("Stack is empty : Underflow");
            return -1;
        }
    }
    public static void main(String args[]){
        Stack_Implementation stack = new Stack_Implementation(3);
        stack.push(4);
        stack.push(3);
        stack.push(13);
        stack.push(11);  

        stack.pop();
        stack.pop();
        System.out.println("peeked element is" + stack.peek());
      }
}
