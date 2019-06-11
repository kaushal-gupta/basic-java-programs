import java.io.*;
 class S
{
  int start=-1;
  int st[]=new int[10];
 

  void push()
{
 BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
 int k=0;
 if(start>9)
System.out.println("Stack overflow");
else
{
 start++;
 System.out.println("Enter the data ");
 try
{
 k=Integer.parseInt(y.readLine());
}
 catch(Exception p)
{}
 st[start]=k;
 System.out.println("The data added succesfully");
}
}
 
 void pop()
{
 if(start==-1)
 System.out.println("Already Empty Stack");
 else 
{
 System.out.println("the data"+st[start]+"is deleted");
 start--;
}
}
 void display()
{
 int n;
 n=start;
 for(int i=0;i<=start;i++)
 System.out.println(st[i]);
 if(start ==-1)
 System.out.println("The stack is empty");
}
}

  
class STACK
{
 public static void main(String args[])
{
 BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
  S obj=new S();
 int g=0;
 String ch="yes";
 while(ch.equals("yes")==true)
{

 System.out.println("Enter 1: for inerst a no.\nEnter 2: for deletion a no.\nEnter 3: for display");;
 try
{
 g=Integer.parseInt(y.readLine());
}
catch(Exception p)
{ 
System.out.println("Error");
}
 switch(g)
{
 case 1:
 obj.push();
 break;
 case 2:
 obj.pop();
 break;
 case 3:
 obj.display();
 break;
 default:
 System.out.println("INVALID INPUT");
 
}
System.out.println("Would you like to continue(yes or no)");
try
{
ch=y.readLine();
}
catch(Exception p)
{}
}
}
}

