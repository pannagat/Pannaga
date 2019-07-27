class reverse
{
public static void main(String args[])
{
String s=" ";
String reverse="life is sick";
int length=s.length();
for(int i=length-1;i<=0;i--)
reverse=reverse+s.charAt(i);
System.out.println(reverse);
}
}