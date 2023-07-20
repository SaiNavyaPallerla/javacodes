import java.util.*;
public class Password {
    int count=0;
    //int wrongcount=0;
    void pass_word(String pass,String org_pass){
        for(int i=0;i<pass.length();i++){
            if(pass.charAt(i)==org_pass.charAt(i)){
                count+=1;
            }
        }

        if(count==pass.length()){
                    System.out.println("password is correct");
                }else{
                    System.out.println("password is wrong");
                }
    }
    public static void main(String args[]){
    //String org_pass="navya";
    int wrongcount=0;
    Scanner sc=new Scanner(System.in);
    Password p=new Password();
    String pass=sc.nextLine();
    String org_pass="navya";

    if(pass.length()==org_pass.length()){
     p.pass_word(pass,org_pass);
    }else{
       System.out.println("password is wrong");
       for(int i=1;i<=5;i++){
             System.out.println("please enter the password again");
             pass=sc.nextLine();
            if(pass.length()==org_pass.length()){
              p.pass_word(pass,org_pass);
            }else{
               wrongcount=wrongcount+1; 
              System.out.println("password is wrong");
               }
            }
          if(wrongcount==5){
         for(int i=30;i>0;i--){
            System.out.println(i);
         }
         System.out.println("please enter the password again");
         pass=sc.nextLine();
         if(pass.length()==org_pass.length()){
              p.pass_word(pass,org_pass);
            }else{
                System.out.println("password is wrong");
            }
}
    }
sc.close();
}
}

