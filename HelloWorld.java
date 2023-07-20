import java.util.*;
class HelloWorld {
    //import java.util.*;
//public class Numbers
//{
    public static void Multiply(int n)
    {
        int factorial=5;
        for(int i=1;i<=n;i++)
        {
         int fact=factorial*i;
        //}
        System.out.println(fact);
        }
        //return;
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Multiply(n);
        sc.close();
    }
}