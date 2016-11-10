class manager extends empc 
{
	int ns;
	public manager()
	{
		ns=6;
	}
	public manager(int i,int s,String nm,int sb)
	{
		super(i,s,nm);
       	ns=sb;
	}
	public String toString()
	{
		System.out.println("*********************************");
		return super.toString()+"\nNumber of subordinates are:"+ns;
	}
}
class manage
{
	public static void main(String[] args) 
	{
        manager m1=new manager();
		System.out.println(m1);
		manager m2=new manager(7,70000,"manager",7);
		System.out.println(m2);
		System.out.println("*********************************");
		//System.out.println("Hello World!");
	}
}
