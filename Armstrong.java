import java.io.*;
 class Arms
{
  int n;
   void check()
   {
    int a,b=0,num;
    num=n;
    while(n>0)
    {
     a=n%10;
     b=b+a*a*a;
     n=n/10;
    }
    if(num==b)
     System.out.println("the no is armstrome no.");
   else
    System.out.println("the no is not armstrome no.");
   }
}
class Armstrong
{
public static void main(String agrs[])
{ 
  String ch="yes";
  while(ch.equals("yes")==true)
{

 BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
 Arms obj=new Arms();
 try
 {
 System.out.println("Enter the no.");
 obj.n=Integer.parseInt(y.readLine());
 }
 catch(IOException p)
 {
 System.out.println("error");
 }
 obj.check();
 System.out.println("Would you like to continue(yes or no)");
try 
{
ch=y.readLine();
}
catch(Exception P)
{}
}
}
}
 


