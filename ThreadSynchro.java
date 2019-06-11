class Syncro
{
int data;
Syncro()
{
data=10;
}
}

 class NewThread  implements Runnable
 {
  Thread t;
 Syncro jk;
 	 NewThread(String a,Syncro s)
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
for(int i=0;i<=3;i++)
{
jk.data++;  
 System.out.println("Child thread: " +t.getName()+"\t"+jk.data);
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
class ThreadSynchro
 {
 public static void main(String args[])
 {
  Syncro ob=new Syncro();

 NewThread obj=  new NewThread("one",ob); // create a new thread
NewThread obj1=  new NewThread("two",ob); 
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