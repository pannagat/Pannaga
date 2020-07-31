abstract class abstractexam
{
double pi;
double r;
double a;
abstract void area();
}
class exam extends abstractexam
{
void area()
{
a=2*pi*r;
System.out.println(a);
}
}
class test
{
public static void main(String args[])
{
abstractexam a1=new exam();
a1.pi=3.14;
a1.r=10.8;
a1.area();
}
}

