//print 1 to 5 numbers
import java.util.*;
class Recurssion1{
    public static void rec1(int n){
        if(n==6){
            return;
        }else{
            System.out.println(n);
            rec1(n+1);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rec1(n);
        sc.close();
    }
}