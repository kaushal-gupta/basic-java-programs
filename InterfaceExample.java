interface Kaushal
{
 void show();
}
class Interfare implements Kaushal
{
 public void show()
{
System.out.println("This is the first interface");
}
}
class InterfaceExample 
{
 public static void main(String args[])
 {
 Interfare obj =new Interfare();
 obj.show();
}
}
