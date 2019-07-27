class classexample
{
double pi;
double r;
double area;
void calculatearea()
{
area=pi*r*r;
System.out.println("area of a circle is " +area);
}
}
class testclassexample
{
public static void main(String args[])
{
classexample a1=new classexample();
classexample a2=new classexample();
a1.pi=3.14;
a1.r=10.86;
a1.calculatearea();

a2.pi=3.14;
a2.r=18.86;
a2.calculatearea();
}
}

