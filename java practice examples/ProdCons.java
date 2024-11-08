class PQ
{
 boolean valset=false;
int n;
synchronized void put(int n)
{
while(valset)
{
try
{
wait();
}
catch(InterruptedException e)
{
}
}
this.n=n;
valset=true;
System.out.println("put:"+n);
notify();
}
synchronized void get(int n)
{ 
int val=n;
while(!valset)
{
try
{
wait();
}
catch(InterruptedException e)
{
}
}
System.out.println("got:"+n);
valset=false;
notify();
}
}
class Producer implements Runnable
{
  PQ pq;
  int n;
  Producer(PQ pq,int n)
{
this.pq=pq;
this.n=n;
}
public void run()
{
 for(int i=0;i<n;i++)
pq.get(i);
}
}
class Consumer implements Runnable
{
  PQ pq;
  int n;
  Consumer(PQ pq,int n)
{
this.pq=pq;
this.n=n;
}
public void run()
{
 for(int i=0;i<n;i++)
pq.put(i);
}
}
class ProdCons
{
public static void main(String args[])
{
PQ pq=new PQ();
int n=Integer.parseInt(args[0]);
Producer p=new Producer(pq,n);
Consumer c=new Consumer(pq,n);
Thread t1=new Thread(p);
Thread t2=new Thread(c);
System.out.println("prodcons:");
t1.start();
t2.start();
}
}


