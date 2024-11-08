class Printer implements Runnable
{
 String str;
int count;
Printer(String str,int count)
{
this.str=str;
this.count=count;
}
public void run()
{
 int time =count*1000;
try
{
Thread.sleep(time);
System.out.println(str);
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class Demo
{
public static void main(String args[])throws Exception
{
Thread t1=new Thread(new Printer("GoodMorning",1));
 Thread t2=new Thread(new Printer("Hello",2));
 Thread t3=new Thread(new Printer("Welcome",3));
t1.start();
t2.start();
t3.start();
t1.join();
t2.join();
t3.join();
System.out.println("completed");
}
}


 