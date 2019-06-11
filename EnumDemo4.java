enum Fruits
{
 Apple,Mango,Bannana;
}
class EnumDemo4
{
public static void  main(String args[])
{
 System.out.println("Here are the all  ordinal values");
 for(Fruits a:Fruits.values())
 System.out.println(a+"  "+a.ordinal());
Fruits ap1,ap2,ap3;
ap1=Fruits.Apple;
ap2=Fruits.Mango;
ap3=Fruits.Bannana;
if(ap1.compareTo(ap2)<0)
System.out.println("ap1 is small");
 if(ap1.equals(ap2))
 System.out.println("ap1 and ap2 are q=equal");

}
}

