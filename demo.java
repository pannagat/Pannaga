abstract class demo
{
abstract void subtract();
int a;
int b;
int c;
}

class test2 extends demo
{
void subtract()
{
c=b-a;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{
demo d=new test2();
d.a=10;
d.b=46;
d.subtract();
}
}