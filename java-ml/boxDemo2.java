class box
{
double width;
double height;
double depth;

}
class boxDemo2
{
    public static void main(String args[])
    {
    box boxobj1=new box();
    boxobj1.width=10;
    boxobj1.height=20;
    boxobj1.depth=15;
    double vol1=boxobj1.width * boxobj1.height * boxobj1.depth;
    System.out.println("volume of box1="+vol1);
    
    
   box boxobj2=new box();
    boxobj2.width=25;
    boxobj2.height=30;
    boxobj2.depth=35;
    double vol2=boxobj2.width * boxobj2.height * boxobj2.depth;
    System.out.println("volume of box2="+vol2);
  }
}
