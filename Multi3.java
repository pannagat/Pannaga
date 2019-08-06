//Executing the thread class by implementing the runnable interface//
class Multi3 implements Runnable
{
public void run()
{
for(int i=0;i<25;i++)
{
try
{
Thread.sleep(1500);
}
catch(InterruptedException e)
{

System.out.println(e);
}
System.out.println(i);
}
}

public static void main(String args[])
{
Multi3 m3=new Multi3();
Thread t1=new Thread(m3);
t1.start();
}
}

