import java.util.*;
import java.io.*;
class Countfile
{
public static void main(String args[])throws Exception
{
Scanner s=new Scanner(System.in);
System.out.println("enter file:");
String str=s.next();
int lno=0;
int cno=0;
int wno=0;
BufferedReader br=null;
try
{
br=new BufferedReader(new FileReader(str));
}
catch(FileNotFoundException e)
{
System.out.println("Filenotfound");
}
String st;
while((st=br.readLine())!=null)
{
lno++;
String words[]=st.split(" ");
for(String i:words)
{
cno=cno+i.length();
}
wno=wno+words.length;
}
System.out.println("lines:"+lno);
System.out.println("words:"+wno);
System.out.println("chars:"+cno);
br.close();
}
}

