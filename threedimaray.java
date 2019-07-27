class threedimaray
{
public static void main(String args[])
{
int i,j,k;
int twodim[][][]=new int[3][3][3];
int temp=0;
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3;k++)
{
twodim[i][j][k]=temp;
temp=i*j*k;
}
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
for(k=0;k<3;k++)
{

System.out.print(twodim[i][j][k] + " ");
}
System.out.println(  );
}
}
}
}
