//import java.util.*;
class Max_min
{
    public static void main(String args[])
    { int max=0;
        int[] numbers={77,87,97,67,57};
        max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
            {
                max=numbers[i];
            }
        }
        int min=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]<min)
            {
                min=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}