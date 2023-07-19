import java.util.*;
class Fibinocci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num1=0;
        int num2=1;
        for(int i=2;i<=n;i++)
        {
            int num3=num1+num2;
            System.out.println(num3);
            //num3=num2;
            num1=num2; 
             num2=num3;
        }
        sc.close();
    
    }
}