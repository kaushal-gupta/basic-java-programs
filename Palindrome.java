import java.io.*;
class Pal
{
  int n;
   void check()
   {
    int a,b=0,num;
    num=n;
    while(n>0)
    {
     a=n%10;

     b=b*10+a;
     n=n/10;
    }
   if(num==b)
    System.out.println("the no is palindrome no.");
   else
    System.out.println("the no is not palindrome no.");
   }
}
class Palindrome
{
 public static void main(String agrd[])
{ 
 String ch="yes";
  while(ch.equals("yes")==true)
 {
 BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
 Pal obj=new Pal();
 try
{
 System.out.println("enter the no.");
 obj.n=Integer.parseInt(y.readLine());
}
catch(IOException p)
{
System.out.println("Error");
}
obj.check();
System.out.println("Would like to continue(yes or no)");
try
{
ch=y.readLine();
}
catch (Exception P)
{}
}
}
}




