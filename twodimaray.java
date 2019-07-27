class twodimaray
{
public static void main(String args[])
{
int i,j;
int twodim[][]=new int[4][5];
int temp=10;
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
twodim[i][j]=temp;
temp += 10;
}
}
for(i=0;i<4;i++)
{
for(j=0;j<5;j++)
{
System.out.print(twodim[i][j] +" ");
}
System.out.println(  );
}
}
}
