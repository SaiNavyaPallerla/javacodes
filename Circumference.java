import java.util.*;
class Circumference
{  
     public static void circle(float radius)
    { 
        double perimeter=2*3.14*radius;
        System.out.println(perimeter);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float radius=sc.nextFloat();
        circle(radius);
        sc.close();
    }
}