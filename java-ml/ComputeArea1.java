import java.util.Scanner;
public class ComputeArea1
{
public static void main(String[]args)
{
Scanner input = new Scanner(System.in);
System.out.print("enter radius");
double radius = input.nextDouble();
double area = radius*radius*3.14;
System.out.println("the area of the circle="+area);
}
}
