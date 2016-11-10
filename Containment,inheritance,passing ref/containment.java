class emp 
{
	int id,salary;
    String name;
	Date doj;
	//int dd,mm,yy;
	public emp()
	{
		id=0;
		salary=1000;
		name="abc";
		doj=new Date();
	}
	public emp(int i,int s,String nm,Date dt)
	{
		id=i;
		salary=s;
		name=nm;
		doj=dt;

	}
	public String toString()
	{
		System.out.println("*********************************");

		return"id is:"+id+"\nsalary is:"+salary+"\nName is:"+name+"\n"+doj;
		
		//System.out.println("id is:"+i+"salary is:"+s+"Name is:"+nm);
	}
}
class containment
{
    public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		emp e1=new emp();
		System.out.println(e1);
		emp e2=new emp(2,50000,"SEED",new Date(4,4,4));
        System.out.println(e2);
		//e1.getData();
		//e1.display();
		//e1.getData(1,2000,seed);
		//e1.display();
	}
}
