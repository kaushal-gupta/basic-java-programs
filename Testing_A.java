class Abc 
{
 int a;
 float b;
 }

class Testing_A
{
 public static void main(String args[])
{
  Abc yp= new Abc();
  yp.a=10;
  yp.b=8.9f;
  Abc tp=new Abc();
  tp=yp;
  System.out.println("a="+tp.a+"b="+tp.b);
  tp.a++;tp.b++;
  System.out.println("a="+yp.a+"b="+yp.b);
}
}