import java.io.*;
 class Pri 
{
   int n;
    void check()
    {
      int i;
      for(i=2;i<n;i++)
      if(n%i==0)
      break;
      if(i==n)
       System.out.println("the no is prime no.");
      else
       System.out.println("the no is not prime no.");
     }
}
 class Prime
 {
 public static void main(String args[])
{
 String ch="yes";
 while(ch.equals("yes")==true)
{
 BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
 Pri obj=new Pri();
 System.out.println("enter the no.");
 try
{
 obj.n=Integer.parseInt(y.readLine());
}
catch( Exception p)
{}
obj.check();
System.out.println("Would you like to  continue(yes or no)");
try
{
ch=y.readLine();
}
catch(Exception p)
{}
}
}
}