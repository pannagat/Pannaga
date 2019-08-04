//super is used to invoke parent class method//

class superexample2
{
double pi;
double r;
double a;

void area()
{
a=pi*r*r;
System.out.println("area of a circle is " +a);
}
}

class superexample4 extends superexample2
{
void area()
{
a=2*pi*r;
System.out.println("area of a circle is " +a);
super.area();
}
}

class test3
{
public static void main(String args[])
{
superexample4 s= new superexample4();
s.pi=3.14;
s.r=10.8;
s.area();

}
}