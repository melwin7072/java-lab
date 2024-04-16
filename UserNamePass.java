import java.util.Scanner;
import java.lang.Exception;
class UsernameException extends Exception
{
  UsernameException(String msg)
  {
    System.out.print(msg);
  }
}
class PasswordException extends Exception
{
  PasswordException(String msg)
  {
    System.out.print(msg);
  }
 }
 public class UserNamePass
 {
   public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
      String username,password;
      System.out.print("enter username:");
      username=sc.nextLine();
      System.out.print("enter password:");
      password=sc.nextLine();
      int len=username.length();
      try
      {
        if(len<8)
          throw new UsernameException("username must be greater than 8 characters\n");
        else if(!password.equals("admin"))
          throw new PasswordException("incorrect password\n");
        else
          System.out.println("login successful");
     }
     catch(UsernameException U)
     { 
       System.out.println(U);
     }
     catch(PasswordException P)
     {
       System.out.println(P);
     }
    }
  }
 
  
    
