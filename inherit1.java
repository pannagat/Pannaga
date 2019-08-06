class inherit1
{
double a;
double b;
double c;
void add()
{
c=a+b;
System.out.println("addition is " +c);
}
}
class inherit2 extends inherit1
{
void sub()
{
c=a-b;
System.out.println("subtraction is " +c);
}
}
class inherit3 extends inherit2
{
void multi()
{
c=a*b;
System.out.println("multiplication is " +c);
}
}

class testinherit
{
public static void main(String args[])
{
inherit3 m1=new inherit3();
inherit3 m2=new inherit3();

m1.a=45.2;
m1.b=12.3;
m1.add();
m1.sub();
m1.multi();
}
}

