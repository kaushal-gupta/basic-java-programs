import java.io.*;
class Calculate 
{
  int a,b;
  void addition()
  { 
   int c=a+b;
   System.out.println("THE ADDITION OF TWO NO IS"+c);
  }
  void substract()
  {
   int c;
   c=a-b;
   System.out.println("THE SUBSTRACION OF TWO NO. IS"+c);
  }
 void multiply()
 {
  int c ;
  c=a*b;
  System.out.println("THE MULTIPLICATION OF TWO NO. IS "+c);
 }
   void divide()
  {
   int c=a/b;
   System.out.println("THE DIVISION OF TWO NO. IS "+c);
  }
    
     void display()
    {
    System.out.println(" the two no. are "+a+b);
    }

}
class Calculator
{ 
public static void main(String arr[])
{
 Calculate tp =new Calculate();int a=0; 
 while(true){
 BufferedReader y =new BufferedReader(new InputStreamReader(System.in));
 try
{
  System.out.println("enter the first no.");
  tp.a=Integer.parseInt(y.readLine());
  System.out.println("enter the second no");
  tp.b=Integer.parseInt(y.readLine());
 System.out.println("enter 1: for addition\n enter 2: for substraction \n enter 3: for multiply\n enter 4: for division\n enter 5: for exit");
 a=Integer.parseInt(y.readLine());
}
 catch(IOException p)
{
  System.out.println("error");
}


switch(a)
{
 case 1:
 tp.addition();
break;
case 2:
tp.substract();
break;
case 3:
tp.multiply();
break;
case 4:
tp.divide();
break;
case 5:
System.exit(0);
default: 
System.out.println("invalid input");
}}}
}