import java.util.*;
class Getbit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int position=sc.nextInt();
        int shift=1<<position;
        if((shift&number)==0){
           System.out.println("Zero");
        }else{
            System.out.println("not Zero");
        }
        sc.close();
    }
}
