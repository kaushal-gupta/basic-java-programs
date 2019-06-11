
interface A<T,V>
	{
		T show();
		V name();
	}
class B implements A<String,String>
{
	public String show()
	{
	return "Hello";
	}
	
	public String name()
	{
	return "bye";
	}
};

class GenInterface
{
public static void main(String args[])
{
 B obj=new B();
 System.out.println(obj.show());
System.out.println(obj.name());

}
}
 
