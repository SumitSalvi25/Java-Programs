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
	public static void swap(Date arr[])
	{
		Date temp;
		temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
	public void display()
	{
		System.out.println("Date is:"+dd+"/"+mm+"/"+yy);
	}
}
class swapd
{
	public static void main(String[] args) 
	{
		/*Date d1=new Date();
		d1.display();*/
		/*Date d1=new Date(1,1,1);
		d1.display();
		Date d2=new Date(2,6,2011);
		d2.display();*/
		 Date arr[]=new Date[2];
		arr[0]=new Date(1,1,1);
		arr[1]=new Date(2,6,2011);
		arr[0].display();
		arr[1].display();
       	Date.swap(arr);
		arr[0].display();
		arr[1].display();

	}
}
