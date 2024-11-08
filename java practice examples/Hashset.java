import java.util.*;
class Hashset
{
public static void main(String args[])throws Exception
{
ArrayList<String> a=new ArrayList<String>();
for(int i=0;i<args.length;i++)
{
a.add(args[i]);
}
System.out.println(a);
Collections.sort(a);
for(String s:a)
{
System.out.println(s);
}
}
}

