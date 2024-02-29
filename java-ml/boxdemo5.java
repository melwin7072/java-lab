class box
{
double width;
double height;
double depth;
double volume()

{
return width*height*depth;
}
void setDim(double w,double h,double d)
{
width=w;
height=h;
depth=d;
}

}
class boxdemo5
{
public static void main(String args[])
{
box mybox1=new box();
box mybox2=new box();
double vol;
 mybox1.setDim(10,20,15);
 mybox2.setDim(3,6,9);
 vol=mybox1.volume();
 System.out.println("volume of 1st box:"+vol);
 vol=mybox2.volume();
 System.out.println("volume of 2nd box:"+vol);
 }
 }
