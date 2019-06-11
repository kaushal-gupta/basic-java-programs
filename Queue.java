class Q
{ 
   int Queue[]=new int[10];
  int front=-1;
  int rear=-1;
  BufferedReader y =new BufferedReader(new InputStreamReader(System.in));
  
    void push()
   { 
     if(rear==9)
     System.out.println(" Queue already Full!!! sorry ");
     else 
     {
       int item;
       System.out.println(" Enter the data ")
       try
      {
      item=Integer.parseInt(y.readLin());
      }
      catch(Exception p)
     { 
      System.out.println(" Error");
     }
   
    if(front==-1&&rear==-1)
     {
      front++; rear++;
     }
     else 
     rear++

   Queue[rear]=item;
   System.out.println("Data added Succesfully");
 
   }
  }
   void pop()
  {
   if(front==-1&&rear==-1)
    System.out.println("Alredy Empty Queue");
   else
  {
   system.out.println("the data " +Queue[front]+" deleted Succesfully");
      front++;
    }
  if(front>rear)
{ front=-1;rear=-1;}
}  

 void display()
{
 if(front==-1&&rear==-1)
 System.out.println("Already Empty Queue");
 else
 {
 int i;
  for(i=front;i<=rear; i++)
  System.out.println(Queue[i]);
  }
}
 
}
 class Queue
{
 BufferedReader y=new BufferedReader(new InputStream(System.in));
 pubic static void main()
  {
   String ch="yes";
   while(ch.equals("yes"))
 {
    Q obj=newQ();
    int choice;
    System.out.println("Enter 1: for insertion \n Enter 2: for deletion \n Enter 3: for display");
    try 
    { 
    choice =Integer.parseInt(y.readLine());
    }
    catch( IOException P)
   {    
   System.out.printn("ERROR");
    }
   
   switch(choice)
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
   default :
   System.out.println(" INVALID INPUT");
  }
  System.out.println("Would you Like to Continue");
 try
{
 ch=y.readLine();
}
 catch(IOException P)
{ 
System.out.println(" Error");
 }
 
}

}
}
