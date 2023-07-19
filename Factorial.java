import java.util.*;
class Factorial{
    public static int fact(int n){
        if(n==1){
            return 1;
        }
        else{
    int factorial=n*fact(n-1);
    //System.out.println(factorial);
    return factorial;
        }
    }
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ans=fact(n);
    System.out.println(ans);
    sc.close();
}
//sc.close();
}