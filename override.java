//method overriding//
class override
{
double length;
double breadth;
double height;
double v;

void volume()
{
v=length*breadth*height;
System.out.println("volume is " +v);

}
}

class override2 extends override
{

void volume()
{
v=length*breadth;
System.out.println("volume is " +v);

}
}

class test
{
public static void main(String args[])
{
override2 a=new override2();
a.length=10.5;
a.breadth=53.2;
a.height=2.3;
a.volume();
}
}

