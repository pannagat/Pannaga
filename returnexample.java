class returnexample
{
double employee;
double salary;
double bonus;

double calculatetotalpay()
{
return salary+bonus;
}
}

class testreturn
{
public static void main(String args[])
{
returnexample e1=new returnexample();
returnexample e2=new returnexample();
double totalpay;
e1.salary=81256.356;
e1.bonus=3623.74;
totalpay=e1.calculatetotalpay();
System.out.println("toal pay is " +totalpay);

e2.salary=42357.356;
e2.bonus=7423.74;
totalpay=e2.calculatetotalpay();
System.out.println("toal pay is " +totalpay);
}
}
