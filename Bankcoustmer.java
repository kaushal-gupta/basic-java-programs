import java.io.*;
 class Bank
{
 int accno;
 String name;
 String address;
 long contact;
 String acty;
 int bal;

 void accountopen(int a)
{
System.out.print("Enter the details of the user  ");
try
{
 System.out.println("Enter the name of the user");
 name=y.readLine();
 System.out.printn("enter the address");
 address = y.readLine();
 System.out.prinln("Enter the contact number");
 contact=Integer.parseInt(y.readLine());
 System.out.println("Enter the tyoe of account you want to open");
 acty=y.readLine();
 System.out.println("enter your starting balance");
 bal=Integer.parseInt(y.readLine());
 accno=a;
 System.out.println("THE ACCOUNT OPEN SUCCESFULLY AND YOUR ACCOUNT NO. IS "+accno);
 }
catch(Exception p)
{
 System.out.println("Error");
}

}

 void deposit(int amt, int no)
{
 
 bal+=amt;
System.out.println("the amount deposit Succesfully");
}
 
 void Withdral(int amt)
{ 
  if(amt<bal)
{
   bal-=Amt;
   System.out.println("Amount Withdrawl Succesfully");
 }
else
System.out.println("NOT ENOUGH BALANCE IN YOUR ACCOUNT);
}

 void bal_enquiry()
{
System.out.println("HEllO"+name"Your balance is "+bal);
}
} 



class bankcoustomer
{
public static void main()
{
 String ch="yes";
 int n=1000;
while(ch.equals("yes")==true) 
{ 
 int g=0; 
 bank obj=new bank();
 BufferedReader ty=new BufferredReader(new InputstreamReader(System.in));
 System.out.println("Enter 1: for openning new account\nEnter 2: for deposit the money\nEnter 3: for withdrawl\nEnter 4: for balance enquire");
 g=Integer.parseInt(ty.readLine());
 switch(g)
{
 case 1:
 obj.accountopen(n);
 n+=10; 
 break;
 case 2:
