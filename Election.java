 import java.io.*;
 class Vote 
{ 
 int A=0,B=0,C=0;
   void vote1()
 {
  A++;
  System.out.println("vote succesully added"+A);
 }
  void vote2()
 {
  B++;
  System.out.println("vote succesully added"+B);
 }
  void vote3()
 {
  C++;
  System.out.println("vote succesully added"+C);
 }

} 
class Election
{ 
   public static void main(String args[])
  { 
     Vote obj=new Vote();
     BufferedReader y=new BufferedReader(new InputStreamReader(System.in));
     char vot='a',ch='m'; 
     int i=0;
     do
     {
      i++;
      try
    { 
     System.out.println("enter your vote(A,B,C)");  
     vot=(char)y.read();
    }
    catch(IOException p)
   {  
    System.out.println("error");
   } 
    switch(vot)
   {
    case 'a':
    obj.vote1();
    break;
    case 'b':
    obj.vote2();
    break;
    case 'c':
    obj.vote3();  
    break;
    default :
    System.out.println("INVALID VOTE");
   }
  System.out.println("enter L: for last vote");
try{  
ch=(char)y.read();
}
catch (IOException p)


{}

 }while(ch!='l');
 }
}
