class ThreadIS extends Thread
{
 public void run()
{ 
 System.out.println("status=" + isAlive());
}
}

class ThreadISALIVE
{

public static void main(String args[])
{
 ThreadIS t=new ThreadIS();
 t.start();

 try
{
 t.join();
}
catch (InterruptedException p)
{}
 System.out.println("Status=" + t.isAlive());
}
}
