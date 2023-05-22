import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        int first = 0;
        int second = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("enter no. of elements: ");
        int n = in.nextInt();

        System.out.println("Fibonacci Series");
        System.out.println(first + " " + second + " ");

        int next;
        for(int i=2;i<n;i++){
            next = first + second;
            System.out.println(next + " ");

            first = second;
            second = next;
        }

    }


    
}
