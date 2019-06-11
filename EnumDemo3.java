enum Fruits
{
 Apple(10),Mango(15),bannana(5);
private int price;
 Fruits(int p)
{
 price=p;
}
 int getprice()
{
 return price;
}
}

class EnumDemo3
{
 public static void main(String args[])
{
System.out.println(" the price of apple is"+Fruits.Apple.getprice());
System.out.println("Here is the cost of all fruits ");
for(Fruits a:Fruits.values())
 System.out.println("the cost of"+a+"is"+a.getprice());
}
}
 