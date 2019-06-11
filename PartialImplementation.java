interface ajay
{
 void show();
}
abstract class Kaushal implements ajay
{
 void ram()
 {
 System.out.println("heLlo");
 }

}
  
class C extends Kaushal
{
 public void  show()
{
 System.out.println("bye");
}
}
 
 class PartialImplementation
{
 public static void main(String args[])
{
 C obj=new C();
 obj.show();
 obj.ram();
}
}
