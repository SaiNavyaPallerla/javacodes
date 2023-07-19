import java.util.*;
class Clearbit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int position=sc.nextInt();
        int shift=1<<position;
        int not_operation=~shift;
        int clear_bit=not_operation&number;
        System.out.println(clear_bit);
        sc.close();
    }
}