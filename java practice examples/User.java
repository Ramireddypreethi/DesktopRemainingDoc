class Myexception extends Exception
{
 public Myexception(String str)
{
super(str);
}
}
class User
{
public static void main(String args[])
{
try
{
throw new Myexception("error1");
}
catch(Myexception m)
{
System.out.println("exception occured");
System.out.println(m.getMessage());
}
}
}
