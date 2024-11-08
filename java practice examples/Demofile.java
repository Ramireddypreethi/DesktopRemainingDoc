import java.io.*;
class Demofile
{
public static void main(String args[])throws Exception
{ BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter file:");
 String fname=br.readLine();
File f=new File(fname);
System.out.println("exists:"+f.exists());
  System.out.println("read:"+f.canRead());
  System.out.println("write:"+f.canWrite());
  System.out.println("length:"+f.length());
}
}
  