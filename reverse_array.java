import java.util.*;
public class Reverse_Of_Array {
    public static void reverse(int arr[],int start,int end){

        //terminating condition
        if(start>=end){
            return;
        }
        //logic to swap
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        //recursive call
        reverse(arr,start+1,end-1);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();

        //declare an array
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //reverse an array
        reverse(arr,0,n-1); 
        System.out.println("After reversing an array");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
}
