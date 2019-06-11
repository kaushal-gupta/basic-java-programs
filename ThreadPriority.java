class Threadpri extends Thread
{
 Thread t;
Threadpri(String a, int t1)
{
 t=new Thread(this,a);
t.setPriority(t1);
 System.out.println(t);
t.start();
}

public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(t.getName()+"\t"+i);
}
}

}

class ThreadPriority
{
  public static void main(String args[])
 {
 Threadpri t1=new Threadpri("one",8);
 Threadpri t2=new Threadpri("two",2);
Thread.sleep(20000);
}
}
