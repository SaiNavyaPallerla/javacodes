import java.util.*;
class Average
{
    public static void avg(int num1,int num2,int num3)
    {
        int avgnum=(num1+num2+num3)/2;
        System.out.println(avgnum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        avg(num1,num2,num3);
        sc.close();
    }
}