import java.io.*;
class Book
{
int bid;
char  bname[]=new char[10];
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
 bname[]=y.readLine();
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
 System.out.print("the name of the book is: "+bname);
 System.out.print("\t the ID of the book is "+bid);
 System.out.print("\tthe name of the book author is "+bauthor);
 System.out.print("\tthe name of the book publisher  is "+bpublisher);
 System.out.print("\tthe price of the book is "+price);
 System.out.print("\t the availabal book "+aqty);
 System.out.print("\tthe  book  issued "+isqty);
}
void booksearch(String name,String author)
{
 if(name.equals(bname)==true&&author.equals(bauthor)==true)
{
System.out.print("THE REQUIRED BOOK FIND AND THE AVAILABLE QUANTITY IS :"+aqty);
}
}
void  bookissue(String name,String author,int a)
{
 if(aqty>=a)
{
 aqty-=a;
 System.out.println("the required book issued");
}
 else 
System.out.println("NOT ENOUGH QYANTITY OF BOOK");
}
void purchase(String name,String author,int q)
{
 if(name.equals(bname)==true&&author.equals(bauthor)==true)
 {
 aqty+=q;
 System.out.println("the book purchased");
}
}
}
class Bookshoper
{
 public static void main(String []args)
{
 Book obj[]=new Book[2];
 int r=0,i=0;
 for(i=0;i<=1;i++)
 obj[i]=new Book();
 String name=" ",author=" ";
 int qty=0; BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
 while(true)
{
 System.out.print(" 1: for input \n2:for the list of available books\n3: for searching the particular book\n4: for issuing a book \n Enter 5:for purshasing the book\n 6: for exit ");


 try
{
System.out.print("Enter your choice");
r=Integer.parseInt(b.readLine()); 
}
catch(IOException p)
{}
switch(r)
{
	 case 1:
	 for(i=0;i<=1;i++)
	 obj[i].input();			
 	break;
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
	obj[i].booksearch(name,author);
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
	obj[i].bookissue(name,author,qty);
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
	obj[i].purchase(name,author,qty);
	break;
	case 6: 
	System.exit(0);
	break;
	default:
	System.out.println("INVALID INPUT ");
	}}
}
}