class Syncro1
{
int data;
Syncro1()
{
data=10;
}
}

 class NewThread1  implements Runnable
 {
  Thread t;
Syncro1 jk;
  NewThread1(String a,Syncro1 s)
 {
  jk=s;
 t = new Thread(this, a);
 System.out.println("Child thread: " + t);
 t.start(); // Start the thread
 }
// This is the entry point for the second thread.
 public void run()
  {
  try
  {
synchronized(jk)
{
for(int i=0;i<=3;i++)
{
jk.data++;  
 System.out.println("Child thread: " +t.getName()+"\t"+jk.data);
}
}
   for(int i = 5; i > 0; i--)
  {
    System.out.println("Child Thread: " + i);
   Thread.sleep(500);
  }
} 
catch (InterruptedException e) 
{
System.out.println("Child interrupted.");
}
System.out.println("Exiting child thread.");
}
}
class ThreadSynchro1
 {
 public static void main(String args[])
 {
  Syncro1 ob=new Syncro1();

 NewThread1 obj=  new NewThread1("one",ob); // create a new thread
NewThread1 obj1=  new NewThread1("two",ob); 
 try
 {
  for(int i = 5; i > 0; i--)
 {
   System.out.println("Main Thread: " + i);
   Thread.sleep(1000);
 }
} 
catch (InterruptedException e)
 {
System.out.println("Main thread interrupted.");
}
System.out.println("Main thread exiting.");
}
}
