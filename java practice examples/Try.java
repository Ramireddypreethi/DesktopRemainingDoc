class Try
{
public static void main(String args[])
{
int arr[]=new int[10];
try
{
int n1=Integer.parseInt(args[1]);
int n2=Integer.parseInt(args[2]);
arr[10]=n1/n2;
}
catch(ArithmeticException ae)
{
System.out.println(ae.getMessage());
}
catch(ArrayIndexOutOfBoundsException a)
{
System.out.println(a.getMessage());
}
finally
{

System.out.println("Hello");
}
}
}



