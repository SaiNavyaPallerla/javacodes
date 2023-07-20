import java.util.*;
class Greaternum
{ 
       
  public static void Greater(int num1,int num2)
    {
        if(num1>num2)
        {
            System.out.println("num1 is greater");
        }else if(num2>num1){
            System.out.println("num2 is greater");
        }
        else{
            System.out.println("num1 & num2 are equal");
        }
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       Greater(num1,num2);
       sc.close();
    }
}