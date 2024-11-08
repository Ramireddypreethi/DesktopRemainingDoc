class Strpal
{
public static void main(String args[])
{ 
String str=args[0];
String r="";
for(int i=str.length()-1;i>=0;i--)
{
r=r+str.charAt(i);
}
if(str.equals(r))
{
System.out.println("palindrome");
}
else
{
System.out.println("not palindrome");
}
}
}