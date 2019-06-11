import java.io.*;
class UsingTHrow
{
  public static void main(String args[])
  {
   try
  {
   throw  new IOException("not error");
 
  }
  catch(IOException e)
  {
   System.out.println("use of throw"+e);
   }
}
}