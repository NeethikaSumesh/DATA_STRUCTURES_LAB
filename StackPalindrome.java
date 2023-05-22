import java.util.*;
class OStack{
private int top;
private int max;
private char arr[];
public OStack(int n){
max=n;
top=-1;
arr=new char[max];
}
public void push(char a){
top++;
arr[top]=a;
}
public char pop(){
return arr[top--];
}
public boolean isEmpty(){
if(top==-1){
return true;
}else{
return false;
}
}
public boolean isFull(){
if(top==max-1){
return true;
}else{
return false;
}
}
}
class Stackpaliandrome{
public static void main(String args[]){
String sequence;
String reverse="";
int n;
System.out.println("enter string");
Scanner scn=new Scanner(System.in);
sequence=scn.nextLine().toLowerCase();
n=sequence.length();
OStack stck=new OStack(n);
for(int i=0;i<n;i++){
if(!stck.isFull()){
stck.push(sequence.charAt(i));
}
}
while(!stck.isEmpty()){
reverse=reverse+stck.pop();
}
if(sequence.equals(reverse)){
System.out.println("the string is paliandrome");
}else{
System.out.println("not paliandrome");
}
}
}

/*
enter string
amma
the string is paliandrome



enter string
neethika
not paliandrome
*/
