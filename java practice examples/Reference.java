
class Reference
{int a,b;
Reference(int a,int b)
{
this.a=a;
this.b=b;
}
void swap(Reference r)
{
int temp=r.a;
a=r.b;
b=temp;
}
public static void main(String args[])
{ int a1=Integer.parseInt(args[0]);
int a2=Integer.parseInt(args[1]);
Reference s=new Reference(a1,a2);
System.out.println("BEfore:"+s.a+" "+s.b);
s.swap(s);
System.out.println("After:"+s.a+" "+s.b);
}
}