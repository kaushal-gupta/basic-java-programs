import java.io.*;
class Pandn
{
  int a;
  void check()
 {
  if( a>0)
  System.out.println("the no. is postive");
  else if(a<0)
  System.out.println("the no. is negative");
  else 
  System.out.println("the no. is zero");
 }
}
 class Positive_neg
 {
  public static void main(String args[])
 {
   String ch ="yes";
   Pandn tp=new Pandn();
   BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
	while(ch.equals("yes")==true)
    {
   try
   {
   System.out.println("enter the no");
   tp.a=Integer.parseInt(y.readLine());
   }
   catch(IOException p)
   {
   System.out.println("error");
   }
   tp.check();
   try
   {
   System.out.print("Would you like to continue(yes or no)");
   ch=y.readLine();
   } 
   catch(IOException p1)
   {} 

  }

}

}