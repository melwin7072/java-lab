import java.util.Scanner;
import java.io.*;
public class ReadDisp
{
  public static void main(String[]args)
 {
   String fname;
   Scanner sc=new Scanner(System.in);
   System.out.print("enter the name of file:");
   fname=sc.nextLine();
   String line=null;
   try
   {
      File file1=new File(fname);
      Scanner fileScanner=new Scanner(file1);
      while(fileScanner.hasNextLine())
   
   {
     line=fileScanner.nextLine();
     System.out.println(line);
   }
   fileScanner.close();
 }
 catch(IOException ex)
{ 
  System.out.println("\nError occured");
  System.out.println("Exception name:"+ ex);
 }   
}
}
