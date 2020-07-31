final class finalexamples
{
int a,b,c;
final void area()
{
c=a*a;
System.out.println(c);
}
}
class finalexam extends finalexamples
{
void area()
{
c=2*a*b;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{
finalexam f1=new finalexam();
f1.a=314;
f1.b=108;
f1.area();
}
}


















////final variable
/*final int a=25;
int b,c;
void area()
{
c=a*b;
System.out.println(c);
}
}
class test
{
public static void main(String args[])
{

finalexamples f1=new finalexamples();
f1.a=25;
f1.b=3;
f1.area();
}
}*/
