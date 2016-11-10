class empcl implements Cloneable 
{
	int id,sal;
	String name;
	public empcl()
	{
		id=0;
		sal=0;
		name="ABC";
	}
	public empcl(int i,int s,String nm)
	{
		id=i;
		sal=s;
		name=nm;
	}
	public String toString()
	{
		System.out.println("*****************************************");
		return"Id is :"+id+"\nSalary is :"+sal+"\nName is :"+name;
		
	}
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException s)
		{
			System.out.println("Exception Error");
			s.printStackTrace();
		}
		return this;
	}
}
class clondemo
{
	public static void main(String[] args) 
	{
		empcl e1=new empcl(2,50000,"Seed");
		empcl e2=(empcl)e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println("*****************************************");

		//System.out.println("Hello World!");
	}
}
