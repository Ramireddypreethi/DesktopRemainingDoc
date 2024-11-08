import java.util.*; 
class Sort{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter no:");
int n=s.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++)
{
str[i]=s.next();
}
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
 if(str[i].compareTo(str[j])>0)
{
String t=str[i];
str[i]=str[j];
str[j]=t;
}
}
}
System.out.println("Sort:");
for(int i=0;i<n;i++)
{
System.out.println(str[i]+" ");
}
}
}