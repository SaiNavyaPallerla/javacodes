import java.util.*;
class Gcd
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    if(num1>num2)
    {
      int num3=num1/num2;
      System.out.println(num3);
    }
    else{
    int num3=num2/num1;
    System.out.println(num3);
    }
    sc.close();
    }
}