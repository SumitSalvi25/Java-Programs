abstract class empc 
{
	int id,salary;
    String name;
	int dd,mm,yy;
	public  empc()
	{
		id=0;
		salary=1000;
		name="abc";
	}
	public  empc(int i,int s,String nm)
	{
		id=i;
		salary=s;
		name=nm;
	}
	abstract int calsal();
	public String toString()
	{
		return"id is:"+id+"\nsalary is:"+salary+"\nName is:"+name;
	}
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	/*	empc e1=new We();
        System.out.println(e1);
		empc e2=new We(1,2000,"seed",5,5);
		  System.out.println(e1);*/
	}
}
