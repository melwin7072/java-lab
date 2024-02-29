class employee
{
int eno;
String ename;
employee()
{
eno=100;
ename="melwin";
}
void show()
{
System.out.println("\nemployee no:-"+eno+"\nemployee name-"+ename);
}
}
class constructor1
{
public static void main(String args[])
{
employee obj1=new employee();
obj1.show();
}
}


