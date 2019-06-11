class NewThread implements Runnable
{
 Thread t;
  NewThread()
 {
  t=new Thread(this,"Demo Thread");
  System.out.println("Child Thread:"+t);
  t.start();// Start the thread
 }
// This is the entry point for the second thread.
 public void run()
{
 try
{
 for(int i=5;i>0;i--)
 {
 System.out.println("child Thread:"+t);
 Thread.sleep(500);
 }
}
 catch(InterruptedException P)
{ 
 System.out.println("child interrupted");
}
 System.out.println("child Exiting");
}
}

class ThreadDemo 
{
public static void main(String args[])
{
 new NewThread();// create a new thread
 try
{
 for(int i=5;i>0;i--)
 {
  System.out.println("Main Thread :"+i);
  Thread.sleep(1000);
 }
}
catch(InterruptedException e)
{
System.out.println(" MAin thread interrupted");
}
System.out.println("Main thread Exiting");
}
}
