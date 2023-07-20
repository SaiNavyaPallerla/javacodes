import java.util.*;
class Updatebit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int position=sc.nextInt();
        int update=sc.nextInt();
        if(update==1){
            int shift=1<<position;
            int output=shift|number;;
            System.out.println(output);

        }else{
            int shift=1<<position;
            int not_oper=~shift;
            int output=not_oper&number;
            System.out.println(output);
        }
        sc.close();
    }
}