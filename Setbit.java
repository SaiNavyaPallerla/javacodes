import java.util.*;
class Setbit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int position = sc.nextInt();
        int shift = 1<<position;
        int set_bit = shift|number;
        System.out.println(set_bit);
        sc.close();
}
}