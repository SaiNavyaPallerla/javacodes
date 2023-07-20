import java.util.Scanner;

public class Pass {
//int c1=0;
    public static void main(String...x){
Scanner s=new Scanner(System.in);
String pwd="nandu@1";
System.out.println("Enter a password");
String new_pwd=s.nextLine();
int c1=0;
if(pwd.equals(new_pwd))
{
System.out.println("you logged in");
}
else
{
   //c1=c1+1;
for(int i=0;i<5;i++)
{
    c1=c1+1;
System.out.println("please check the password");
new_pwd=s.nextLine();
if(pwd.equals(new_pwd))
{
System.out.println("you entered correct");
break;
}
}
if(c1==5){
for(int count=30;count>0;count--)
{
System.out.println(count);
}
System.out.println("Enter a password");
new_pwd=s.nextLine();
}
}
s.close();
    }
    
}
