
import java.io.*;
import java.util.*;
class MyStack
{
	private int max;
	private int TOS=-1;
	private int arr[]=new int[50];
	private int value=0;
	public MyStack(int size)
	{
	  max=size;
	}
	public void push(int item)
	{
	 if(TOS<max)
	 { TOS++; 
	   arr[TOS]=item;
	 }
	 }
	 public int pop()
	 {
	   int item=arr[TOS];
	   TOS--;
	   return item;
	 }
	 public int isEmpty()
	 {
	   if(TOS==-1)
	     return 1;
	   else
	     return 0;
	 }
	 public int isFUll()
	 {
	   if(TOS==max)
	     return 1;
	   else
	     return 0;
	 }
	 public int peek()
	 {
	   return arr[TOS];
	 }
}
class PostFixevaluation
{
     public static boolean isOperator(char ch)
     {
       if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^')
         return true;
       else
         return false;
     }
     
     public static int operation(char c,int first,int second)
     {
       switch(c)
       {
         case '+': return second+first;
         case '-': return second-first;
         case '*': return second*first;
         case '/': return second/first;
         case '^': return second^first;
       }
      return 0;
      }   
     
     
     public static void main(String args[])
     {
        System.out.print("Enter the postfix expression:");
        Scanner scn=new Scanner(System.in);
        String pfix=scn.nextLine();
        int len=pfix.length();
        MyStack st=new MyStack(len);
        char c;
        for(int i=0;i<len;i++)
        {
        c=pfix.charAt(i);
        if(isOperator(c))
        {
	   int first=st.pop();
	   int second=st.pop();
	   int result=operation(c,first,second);
	   st.push(result);
	 }
	 else if(c==' ')
	 {
	   int a=st.pop();
	   int b=st.pop();
	   int m=a+(10*b);
	   st.push(m);
	  } 
	 else
	  
	 st.push(c-'0');
	 
	 }
	  int ans=st.pop();
	  System.out.print("Postfix string after evaluation:"+ans+"\n");
      }
}

/*
Enter the postfix expression:231*+9-
Postfix string after evaluation:-4
*/
