import java.util.Scanner; 
class matrix
{
  int m,n,i,j;
  int[][]a=new int[5][5];
  int[][]b=new int[5][5];
  int[][]c=new int[5][5];
  Scanner sc=new Scanner(System.in);
  void get()
  {
     System.out.print("enter no:of rows:");
     m=sc.nextInt();
     System.out.print("enter no:of column:");
     n=sc.nextInt();
     System.out.println("enter elements of matrix a");
     for(1=0;i<m;i++)
         for(j=0;j<n;j++)
             a[i][j]=sc.nextint();
             
     System.out.println("enter elements of matrix b");
     for(i=0;i<m;i++)
         for(j=0;j<n;j++)
             b[i][j]=sc.nextint();
     }
     void add()
     {
  
        for(i=0;i<m;i++)
           for(j=0;j<n;j++)
              c[i][j]=a[i][j]+b[i][j];
     }
     void display()
     {
         System.out.println("matrix a");
         for(i=0;i<m;i++)
         {
             for(j=0;j<n;j++)
             {
             System.out.print(a[i][j]+"");
             }
             System.out.println();
             
          }
           
          System.out.println("matrix b");
          for(i=0;i<m;i++)
          
          {
             for(j=0;j<n;j++)
             {
             System.out.print(b[i][j]+"");
             }
             System.out.println();
          }
          
          
          System.out.println("matrix c");
          for(i=0;i<m;i++)
          {
             for(j=0;j<n;j++)
             {
             System.out.print(c[i][j]+"");
             }
             System.out.println();
             
          }
          
       }
    }
       
    public class Addmatrix2
    
    {
       public static void main(String args[])
       {
       matrix ob=new matrix();
       ob.get();
       ob.add();
       ob.display();
       }
     }
}   

