class Printer implements Runnable
{
 String str;
int not,count;
Printer(String str,int not,int count)
{
this.str=str;
this.not=not;
this.count=count;
}
public void run()
{
 int time =count*1000;
try
{
Thread.sleep(time);
for(int i=0;i<not;i++)
{
System.out.println(str);
}
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
}
class Demo
{
public static void main(String args[])
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


 