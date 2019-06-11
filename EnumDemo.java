enum Fruits
{
Apple,mango,Bannana;
}
class EnumDemo
{
 public static void main(String args[])
{ 
 Fruits ap;
 ap=Fruits.mango;
 System.out.println("Value of ap"+ap);
 ap=Fruits.mango;
 if(ap==Fruits.mango)
 System.out.println("ap contains bannana");
 switch(ap)
{
 case Apple:
 System.out.println("Apple is fav");
 break;
 case mango:
 System.out.println("mango is fav");
 break;
 case Bannana:
 System.out.println("Bannana is fav");
}
}
}
