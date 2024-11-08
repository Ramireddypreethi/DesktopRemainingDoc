interface I1
{
void set();
}
interface I2
{
void set1();
}

class Multiple implements I1,I2
{
public void set()
{
System.out.println("hello");
}
public void set1()
{
System.out.println("hi");
}
public void set3()
{
System.out.println("hell");
}
public static void main(String args[])
{
Multiple m=new Multiple();
m.set();
m.set1();
m.set3();
}
}