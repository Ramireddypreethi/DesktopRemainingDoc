class A
{
int l,b;
A(int l,int b)
{
this.l=l;
this.b=b;
}
void area()
{ 
System.out.println(l*b);
}
}
class B extends A
{int h1;
B(int l, int b,int h)
{super(l,b);
h1=h;
}
void area1()
{ 
System.out.println(l*b*h1);
}
}
class C extends B
{int r1;
C(int l,int b,int h,int r)
{super(l,b,h);
r1=r;
}
void dis()
{ 
System.out.println(r1);
}
}
class Dynamic
{
 public static void main(String args[])
    {  

      C c=new C(1,2,3,4);
c.area();
c.area1();
c.dis();
}
}
     