enum Fruits 
{
 Apple,Mango,Bannana;
}
class EnumDemo2
{
 public static void main(String arsg[])
{ 
 System.out.println("Here are all Fruits");
 Fruits arr[]=Fruits.values();
 for(Fruits i:arr)
 System.out.println(i);
 Fruits ap=Fruits.valueOf("Apple");
 System.out.println(ap);
}
}
