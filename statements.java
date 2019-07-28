class statements
{
public static void main(String args[])
{
/*int i;
for(i=0;i<25;i++)
{
System.out.println("value of i is " + i);
}
}
*****************************************
int i=-10;
while(i<0)
{
System.out.println("value of i is " + i);
i++;
}
}
}
****************************************
int i=-10;
do
{
System.out.println("value of i is " + i);
}
while(i<0);
}
}
*****************************************/
double salary;

double tax;
salary=125633;

if(salary<=20000)
{
tax=.15*salary;
System.out.println("tax is " +tax);
}
else if(salary<=50000)
{
tax=.25*salary;
System.out.println("tax is " +tax);
}
else
{
tax=.40*salary;
System.out.println("tax is " +tax);
}
}
}
