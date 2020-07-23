class thismethod
{
int a,b,c;
void add()
{
c=a+b;
System.out.println(c);
}

void sub()
{
c=a-b;
System.out.println(c);
this.add();
}
}
class test
{
public static void main(String args[])
{
thismethod m1=new thismethod();
m1.a=85;
m1.b=15;
m1.sub();
}
}
