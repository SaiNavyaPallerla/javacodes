//print fibonacci series using recurssion.
import java.util.*;
class Fib_recurssion{
    public static void Fib(int n){
        if(n>0){
            return;
        }else{
        int n1=0;
        int n2=1;
       int n3=n1+n2;
       //System.out.println(n3);
       n1=n2;
       n2=n3;
       System.out.print(" "+n3);
       Fib(n-1);
       }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=10;
        int n1=0;
        int n2=1;
        System.out.println(n1+" "+n2);
        Fib(n-2);
        sc.close();
    }
}