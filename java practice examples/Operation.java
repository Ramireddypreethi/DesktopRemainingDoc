import p1.*;
import java.util.*;
import p2.*;
class Operation
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=0,a=0,b=0;
Ar c=new Ar();
Cal o=new Cal();
System.out.println("1.addition\n 2.Subtraction\n s3.multiplication 4.division\n 5.square\n 6.cube\n 7.squareroot ");
System.out.println("Enter your choice:");
num=s.nextInt();
if(num>0 && num<5)
{
System.out.println("enter two integers:");
a=s.nextInt();
b=s.nextInt();
}
else if(num>=5 && num<=7)
{
System.out.println("enter integer number:");
a=s.nextInt();
}
else
{
System.out.println("Invalid choice");
System.exit(0);
}
switch(num)
{
case 1:c.addition(a,b);
break;
case 2:c.subtraction(a,b);
break;
case 3:c.multiplication(a,b);
break;
case 4:c.division(a,b);
break;
case 5:o.square(a);
break;
case 6:o.cube(a);
break;
case 7:o.square_root(a);
break;
}
}
}




