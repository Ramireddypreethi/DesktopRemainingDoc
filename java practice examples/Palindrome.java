import java.util.*;
class Palindrome
{
public static void main(String args[])
{int rev=0;
Scanner s=new Scanner(System.in);
System.out.print("Enter a number:");
int n=s.nextInt();
int temp=n;
while(n>0)
{
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
System.out.println("reverse no :"+rev);
if(temp==rev)
{
System.out.print("palindrome");
}
else
{
System.out.print(" not palindrome");
}
}
}