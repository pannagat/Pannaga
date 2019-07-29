class overload
{
int area(int length,int breadth)
{
return length*breadth;
}

double area(double length,double breadth,double height)
{
return length*breadth*height;
}
}
class testoverload
{
public static void main(String args[])
{
overload o1=new overload();
overload o2=new overload();
int a;
a=o1.area(48,56);
System.out.println("area of a rectangle is " +a);

double b;
b=o2.area(3.14,10.8,4.5);
System.out.println("area of a cube is " +b);
}
}
