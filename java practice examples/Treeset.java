import java.util.*;
class Treeset
{
public static void main(String args[])throws Exception
{
 TreeSet<Object> t=new TreeSet<Object>();
 for(int i=0;i<args.length;i++)
{
  t.add(args[i]);
}
TreeSet<Object> t1=(TreeSet<Object>)t.descendingSet();
for(Object i1:t1)
{
System.out.println(i1);
}
}
}