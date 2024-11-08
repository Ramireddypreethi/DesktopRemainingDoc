import java.util.*;
class Prime
{
 public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int count=0;
for(int i=0;i<n;i++)
{ count=0;
 for(int j=1;j<=i;j++)
  {
    if(i%j==0)
{ 
 count++;
}
}
if(count==2)
{
System.out.print(" "+i);
}

}
System.out.println(" ");


}
}