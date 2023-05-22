import java.util.*;
class myStack
{
public int arr[];
public int max, top;

myStack(int m)
{
max=m;
arr=new int[max];
top=-1;
}

public void push(int c)
{
top++;
arr[top]=c;
}

public int pop()
{
int c=arr[top];
top--;
return(c);
}
public int peek()
{
    return arr[top];
}

public boolean isempty()
{
if(top==-1)
return(true);
else
return(false);
}

public boolean isfull()
{
if(top==max-1)
return(true);
else
return(false);
}


}
class stack_array
{
public static void main(String arg[])
{
Scanner in=new Scanner(System.in);
System.out.println("Enter the stack size");
int s = in.nextInt();
myStack ob=new myStack(s);
int choice=0,temp;
while(choice!=4)
{
     System.out.println("Enter 1.push,2. pop,3. peek,4 exit");
    choice=in.nextInt();
switch(choice)
{
case 1:
{
if(ob.isfull()==false)
{
System.out.println("Enter element");
temp=in.nextInt();
ob.push(temp);
}
else 
System.out.println("Overflow");
break;
}
case 2:
{
if(ob.isempty()==false)
{
temp=ob.pop();
System.out.println(temp);
}
else 
System.out.println("Underflow");
break;
}
case 3:
if(ob.isempty()==false)
{
    temp=ob.peek();
    System.out.println(temp);
}
break;

}

}
}
}
