import java.io.*;
class Fileoutput
{
public static void main(String [] args) throws IOException
{
FileOutputStream obj=new FileOutputStream("data.txt");
try
{
obj.write('A');
obj.write('m');
obj.write('i');
obj.write('t');
}
catch(FileNotFoundException p)
{}
obj.close();
}
}
