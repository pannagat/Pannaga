//super is used to access the immediate parent class instance variable//

class superexample
{
String s1="Java";
}

class superexample2 extends superexample
{
String s1="dotnet";
void add()
{
System.out.println(s1);
System.out.println(super.s1);
}
}

class test
{
public static void main(String args[])
{
superexample2 e=new superexample2();
e.add();
}
}

