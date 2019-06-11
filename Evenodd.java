import java.io.*;
class Eveodd
{
 int a;
  void check()
  {
    if(a%2==0)
    System.out.println("the no. is even");
    else 
    System.out.println("the no. is odd");
   }
}
class Evenodd
{
public static void main(String arr[]) 
{
 String ch="yes"; 
 while(ch.equals("yes")==true)
{
 Eveodd obj=new Eveodd(); 
 BufferedReader y= new BufferedReader(new InputStreamReader(System.in));
 try
{
 System.out.println("enter the no.");
 obj.a=Integer.parseInt(y.readLine());
}
catch(IOException p)
{ 
System.out.println("error");
}
obj.check();
 System.out.println("Would you like to  continue");
 try
{
 System.out.println("Enter yes or no");
 ch=y.readLine();
}
catch(Exception p)
 { 
System.out.println("Error");
}
}
}
}