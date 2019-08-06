//Executing the thread by extending the thread class//
class Multi2 extends Thread
{
public void run()
{
for(int i=1;i<50;i++)
{
try
{
Thread.sleep(1000);
}
catch(InterruptedException e)
{
System.out.println(e);
}
System.out.println(i);
}
}
