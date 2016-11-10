class Date 
{
	int dd,mm,yy;
	public Date()
	{
		dd=mm=yy=1;
	}
	public Date(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public String toString()
	{
		return"Date is:"+dd+"/"+mm+"/"+yy;
	}
	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1);
		//d1.display();
		Date d2=new Date(28,5,2011);
		System.out.println(d2);
		//d2.display();
	}
}
