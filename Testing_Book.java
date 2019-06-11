import java.io.*;
class Book
{
int bid;
String bname;
String bauthor;
String bpublisher;
int price,aqty,isqty;
  void input()
 {
  BufferedReader y= new BufferedReader(new InputStreamReader(System.in));
  try
 {
 System.out.println("enter book id ");
 bid=Integer.parseInt(y.readLine());
 System.out.println("enter book name ");
 bname=y.readLine();
 System.out.println("enter book author");
 bauthor= y.readLine();
 System.out.println("enter book publisher ");
 bpublisher=y.readLine();
 System.out.println("enter book price ");
 price=Integer.parseInt(y.readLine());
 System.out.println("enter the availabe qyantity ");
 aqty=Integer.parseInt(y.readLine());
 }
 catch(IOException p)
 {
 System.out.println("\n error");
 }
 System.out.println("book added successfully.");
 }
 void display()
 { 
 System.out.print(bname);
 System.out.print("\t"+bid);
 System.out.print("\t"+bauthor);
 System.out.print("\t"+bpublisher);
 System.out.print("\t"+price);
 System.out.print("\t"+aqty);
 System.out.println("\t"+isqty);
}

int booksearch(String name,String author)
{
  if(name.equals(bname)==true && author.equals(bauthor)==true)
   return (1);
  else
   return (0);
}

void  bookissue(int q)
{
 aqty-=q;
 System.out.println("book issued successfully.");
}
void purchase(int q)
{
 aqty+=q;
 System.out.println("book purchased successfully.");
}
int check_availability(int t)
{
if(aqty>=t)
return (1);
else
return (0);
}
}

class Testing_Book
{
 public static void main(String []args)
{
 Book obj[]=new Book[2];
 int r=0,i=0;
for(i=0;i<2;i++)
 obj[i]=new Book();
 String name="",author="";
 int qty=0;
for(i=0;i<2;i++)
obj[i].input();
char ch='y';
while(true)
{
 System.out.print(" 2: for the list of available books\n 3: for searching the particular book\n 4: for issuing a book \n 5:for purshasing the book \n 6.exit");
 BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 try
{
System.out.print("Enter your choice");
r=Integer.parseInt(b.readLine()); 
}
catch(IOException p)
{}
switch(r)
{
	case 2:
	for(i=0;i<=1;i++)
	obj[i].display();
	break;
	case 3:	
	try
	{
	System.out.println("enter the name of the book");
	name=b.readLine();
	System.out.println("enter the name of the author");
	author=b.readLine();
	}
	catch(IOException p)
	{
	}
	for(i=0;i<=1;i++)
	{
	if(obj[i].booksearch(name,author)==1)
	{
	System.out.println("\n Book found");
	obj[i].display();
	break;
	}
	}
	break;
	case 4:
	try
	{
	System.out.println("enter the name of the book");
	name=b.readLine();
	System.out.println("enter the name of the author");
	author=b.readLine();
	System.out.print("enter no.of required copies");
	qty=Integer.parseInt(b.readLine());
	}
	catch(IOException p)
	{}
	for(i=0;i<=1;i++)
	{
       	  if(obj[i].booksearch(name,author)==1)
	  {
	   if(obj[i].check_availability(qty)==1)
	   {
	    obj[i].bookissue(qty);	
	    break;
	   }
	  else
	   System.out.println("required copies not in stock");
	  break;
	 }
	}
	if(i==2)
	System.out.println("required book not in stock");
	break;
	case 5:
	try
	{
	System.out.println("enter the name of the book");
	name=b.readLine();
	System.out.println("enter the name of the author");
	author=b.readLine();
	System.out.println("enter no. of required copies");
	qty=Integer.parseInt(b.readLine());
	}
	catch(IOException p)
	{}
	for(i=0;i<=1;i++)
	{
	if(obj[i].booksearch(name,author)==1)
	{
	obj[i].purchase(qty);
	break;
	}
	}
	break;
	case 6:
	System.exit(0);
	default:
	System.out.println("\nwrong choice");
	}
}
}
}
	

