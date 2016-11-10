class We extends empcabs
{
	int hrs,rate;
	public We()
	{
		hrs=0;
		rate=0;
	}
	public We(int i,int s,String nm,int h,int r)
	{
        super (i,s,nm);
		hrs=h;
		rate=r;
	}
	public int calsal()
	{
		return hrs*rate;
	}
	public String toString()
	{
		System.out.println("*****************************************");
		return super.toString()+"\nhrs are:"+hrs+"\nrate is:"+rate+"\nSalary is:"+calsal();
	}
}
class wedemo
{
	public static void main(String[] args) 
	{
		We e1=new We();
		//e1.calsal();
		System.out.println(e1);
		We e2=new We(4,9000,"******",5,200);
		System.out.println(e2);
		System.out.println("*****************************************");//System.out.println("Hello World!");
	}
}
