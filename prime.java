/*check whether a input no. is prime or not
7-1,7 prime
6-1,2,3,6 not prime
11-1,11 prime
 */

import java.util.Scanner;
public class prime {
    public static boolean checkPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args){
        

        System.out.println("Enter the number  : ");
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        if(n>=2 && checkPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("not prime");
        }

         

    }
    
}
