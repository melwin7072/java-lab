public class box
{
double width;
double height;
double depth;
}
class classDemo{
public static void main(String[]args){
box boxobj=new box();
boxobj.width=10;
boxobj.height=20;
boxobj.depth=15;

double vol = boxobj.width * boxobj.height * boxobj.depth;
System.out.println("volume:"+vol);
}
}
