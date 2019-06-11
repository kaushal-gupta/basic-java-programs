import java.io.*;
class Max_minno
{  
 int a[]=new int[10];
 void input()
 {
 BufferedReader y=new BufferedReader(new InputStreamReader(System.in)); 
 System.out.println("Enter 10 nos");
 for(int i=0; i<=9;i++)
 {
 try
 {
 a[i]=Integer.parseInt(y.readLine());
 }
 catch(IOException p)
 { 
 System.out.println("error");
 }
 }
} 
void maxno()
 {
  int max;
  max=a[0];
  int i;
  for(i=1;i<10;i++)
    if(max<a[i])
     max=a[i];
    System.out.println("the max no. is"+max);
 }
  void minno()
   {
    int min;
    min=a[0];
    for(int i=1;i<10;i++)
    if(min>a[i])
    min=a[i];
    System.out.println("the min no. is"+min); 
   }
}
 class Max_Min
{
 public static void main(String ags[])
{
 String ch="yes";
 while(ch.equals("yes")==true)
{

 BufferedReader m=new BufferedReader(new InputStreamReader(System.in));
 int g=0;
 Max_minno obj=new Max_minno();
 obj.input();
 System.out.println("Enter 1: max. no\nEnter 2: for min. no");
 try
 {
 g=Integer.parseInt(m.readLine());
 }
catch(IOException t)
{}
switch(g)
{
 case 1:
 obj.maxno();
 break;
 case 2:
 obj.minno();
 break;
 default:
 System.out.println("invalid input");
}

System.out.println("would you like to continue(yes or no)");
try
{
ch= m.readLine();
}
catch(IOException p)
{}
} 
}
}
