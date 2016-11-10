class Date 
{
	int dd,mm,yy;
	/*public Date()
	{
		dd=mm=yy=1;
	}*/
	public Date(int d,int m,int y)
	{
		dd=d;
		mm=m;
		yy=y;
	}
	public static void swap(Date dt1,Date dt2)
	{
		Date temp;
		temp=dt1;
		dt1=dt2;
		dt2=temp;
	}
	public void display()
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}
}
class Mydate
{
	public static void main(String[] args) 
	{
		/*Date d1=new Date();
		d1.display();*/
		Date d1=new Date(1,1,1);
		d1.display();
		Date d2=new Date(28,5,2011);
		d2.display();
		Date.swap(d1,d2);
		d1.display();
		d2.display();

	}
}
