/*arr = {11,15,16,19,25,36,67}
low=0
low = mid+1=3+1=4 high=6
mid =  5 
arr[mid]=36*/
import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = in.nextInt();

        //declare an array
        int[] arr=new int[n];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the vlaue to be searched : ");
        int num = in.nextInt();

        int low=0;
        int high = n-1;
        int mid = 0;

        while(low<=high){
            mid = (low + high)/2; 

            if(arr[mid]==num){
                System.out.println("value is found at index" + mid);
                break;

            }else if(arr[mid]>num)
            {
                high = mid-1;
            }else if(arr[mid]<num)
            {
                    low = mid + 1;
                }
            }
        if(low>high){
            System.out.println("value is not found in array");
        }

         
    }
    
}
