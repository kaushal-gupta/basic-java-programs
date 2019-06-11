import java.io.*;
class G
{
 int a,b,c;
  void check()
 {
 int sum;
 sum=a+b+c;
 float per=sum*0.333f;
  if(per>90)
  System.out.println("the grade is A");
  else if(per>75&&per<=90)
  System.out.println("the grade is B");
  else 
  System.out.println("the grade is C");
 }
}
 class Grade 
{ 
 public static void main(String arg[])
 {

 String ch="yes";
 while (ch.equals("yes")==true)
 { 
  BufferedReader y =new BufferedReader(new InputStreamReader(System.in)); 
  G obj =new G();
  System.out.println("Enter the marks of the three subject");
  try
  {
  obj.a=Integer.parseInt(y.readLine());
  obj.b=Integer.parseInt(y.readLine());
  obj.c=Integer.parseInt(y.readLine());
  }
  catch(IOException p)
  { 
  System.out.println("error");
  }
  obj.check();
System.out.println("would you like to continue(yes or no)");
try
 {
 ch=y.readLine();
}
catch(IOException p)  
{}
}
}

}



