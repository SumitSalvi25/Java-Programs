class GDemo 
{
	int i;
	public GDemo()
	{
	 i=25;
	}
	public void display()
	{
		System.out.println("Value of i is:"+i);
	}
    public void create()
	{
		GDemo g1=new GDemo();
		g1.display();
		g1=new GDemo();
		g1=new GDemo();
		System.gc();
	}
	public void finalize()
	{
		System.out.println("Finalize is called");
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		GDemo g2=new GDemo();
		g2.display();
		g2.create();
		System.out.println("Out of create");
		g2=null;
		System.gc();
	}
}
