import java.io.*;
class Enter
{
public static void main(String []args)
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
try
{
int a;
System.out.println("enter no.");
a=Integer.parseInt(b.readLine());
System.out.println("\n entered no. is :"+a);
String j;
System.out.println("enter name");
j=b.readLine();
System.out.println("\n entered name is :"+j);
}
catch(NumberFormatException p1)
{
System.out.println("type mismatch");
}
catch(IOException p)
{
System.out.println("\n error");
}
System.out.println("the end");
}
}
