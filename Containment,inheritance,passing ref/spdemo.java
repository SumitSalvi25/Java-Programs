class sp extends We 
{
	int sales,comm;
	public sp()
	{
		sales=0;
		comm=0;
	}
	public sp(int i,int s,String nm,int h,int r,int sl,int c)
	{
		super(i,s,nm,h,r);
		sales=sl;
		comm=c;
	}
	public int calsal()
	{
		return(super.calsal()+(sales*comm));
	}
	public String toString()
	{
		return super.toString()+"\nSales are:"+sales+"\nCommission is:"+comm+"\nSalary is:"+calsal();
	}
}
class spdemo
{
    public static void main(String[] args) 
	{
		sp s1=new sp();
		System.out.println(s1);
		sp s2=new sp(6,60000,"***",6,200,45,300);
		System.out.println(s2);
		System.out.println("*****************************************");
		//System.out.println("Hello World!");
	}
}
