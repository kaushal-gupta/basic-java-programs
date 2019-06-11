import java.io.*;
class Convert
{
public static void main(String [] args)
{
char p='A';
int u;
u=p;
BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.println("enter single character");
u=y.read();
System.out.println(u);
}
catch(IOException i)
{}
}
}
