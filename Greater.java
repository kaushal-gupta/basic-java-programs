import java.io.*;
class Great 
{  
 int a,b,c;
 void out()
  {
     if(a>b && a>c)
     System.out.println("the"+a +" no  is greater no.");
     else if(b>a&&b>c)
     System.out.println("the"+b+" no  is greater no.");
     else if(c>b&&c>a) 
     System.out.println("the"+c+" no  is greater no.");
     else 
     System.out.println("all are equal no.");
   }
}
class Greater 
{
 public static void main(String args[])
{
 String ch="yes";
 while (ch.equals("yes")==true)
{

 BufferedReader y =new BufferedReader(new InputStreamReader(System.in));
 Great obj=new Great();
  try
 {
  System.out.println("enter the three no");
  obj.a=Integer.parseInt(y.readLine());
  obj.b=Integer.parseInt(y.readLine());
  obj.c=Integer.parseInt(y.readLine());
 }
 catch(IOException p)
 { 
 System.out.println("error");
 }
 obj.out();
}
}
}

  