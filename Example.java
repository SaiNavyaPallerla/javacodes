import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter string a: ");
        String a = sc.nextLine();
        
        System.out.print("Enter string b: ");
        String b = sc.nextLine();
        
        String c = "";
        
        for (int i = 0; i < a.length(); i++) {
            //char ch = a.charAt(i);
            
            if (b.contains(String.valueOf(a.charAt(i)))) {
                continue;
            } else {
                c += a.charAt(i)
                ;
            }
        }
        
        System.out.println("Resulting string c: " + c);
        
        sc.close();
}
}