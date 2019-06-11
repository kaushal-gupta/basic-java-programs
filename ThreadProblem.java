class A
{
 int y;
A()
{
y=10;
}
}
class B implements Runnable
{
 A ob;
 Thread t;
B(String z, A ry)
{
ob=ry;
t=new Thread(this,z);
System.out.println(t);
t.start();
}
public void run()
{
 int i;
 for(i=0;i<=3;i++)
{
 ob.y++;
 System.out.println(t.getName()+ob.y);
 }
}
}
class ThreadProblem
{
 public static void main(String args[])
{
A sh=new A();
B obj1=new B("one",sh);
B obj2=new B("two",sh);
}
}