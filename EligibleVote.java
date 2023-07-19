import java.util.*;
class EligibleVote
{   
    public static int vote(int age)
    {
        if(age>=18)
        {
            System.out.println("eligible");
        }
        else{
            System.out.println("not_eligible");
        }
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        vote(age);

    }
}
//this is other way--------------------------------------------------------------//
import java.util.*;
class EligibleVote
{   
    public static boolean vote(int age)
    {
        if(age>=18)
        {
            return true;
            //System.out.println("eligible");
        }
        else{
            return false;
            //System.out.println("not_eligible");
        }
        //return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        System.out.println(vote(age));
     }
}