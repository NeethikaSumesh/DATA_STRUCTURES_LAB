/*print num from 1-100 without using loop (recursion)*/
public class printnum {
    public static void printNum(int num){
        if(num <=100){
            System.out.print(num + " ");
            printNum(num+1);
        }
    }
    public static void main(String args[]){
        int n=1;
        printNum(n);

    }
    
}
