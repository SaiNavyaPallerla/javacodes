//print the numbers from n to 1
import java.util.*;
class Recurssion{
    public static void rec(int n){
        if(n==0){
            return;
        }else{
           System.out.println(n);
           rec(n-1); 
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec(n);
        sc.close();
    }
}