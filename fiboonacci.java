class fiboonacci
{
public static void main(String args[])
{
int a=0;
int b=1;
long c=25;
System.out.println(a +" " +b);
for(int d=2;d<c;d++)
{
int f=a+b;
a=b;
b=f;
System.out.println(" " +f);
}
}
}
