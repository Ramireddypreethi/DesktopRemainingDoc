class Fib
{
  public static void main(String args[])
{
  int n=Integer.parseInt(args[0]);
  int a=0;
  int b=1;
int c=0;
  System.out.print(a+" "+b);

  for(c=a+b;c<=n;c=a+b)
    { 
      System.out.print(" "+c);
       a=b;
       b=c;
    }
System.out.println();
}
}
      