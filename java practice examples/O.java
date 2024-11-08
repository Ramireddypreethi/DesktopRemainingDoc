import p1.*;
import p2.*;
import java.util.*;
class O
{
public static void main(String args[])
{
int a=0,b=0,num=0;
A l=new A();
Scanner s=new Scanner(System.in);
C c=new C();
num=s.nextInt();
if(num>0&&num<5)
{
System.out.println("ENTER 2:");
a=s.nextInt();
b=s.nextInt();
}
else if(num>=5&&num<=7)
{
System.out.println("ENTER 1:");
a=s.nextInt();
}
else
{
System.out.println("Invalid");
System.exit(0);
}
switch(num)
{
case 1:l.add(a,b);break;
case 2:l.sub(a,b);break;
case 3:l.mul(a,b);break;
case 4:l.div(a,b);break;
case 5:c.square(a);break;
case 6:c.cube(a);break;
case 7:c.root(a);break;
}
}
}


