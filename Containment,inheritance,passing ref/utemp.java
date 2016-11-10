class refpass 
{
	static int tot;
	public static void main(String[] args) 
	{
		empc e[]=new empc[4];
		e[0]=new empc();
		e[1]=new We();
		e[2]=new sp();
		e[3]=new manager();
		utemp u1=new utemp();
		tot=u1.tsal(e);
		System.out.println("Total salary is:"+tot);
	}
}
class utemp
{
	public int tsal(empc e[])
	{
		int total=0;
		int i=0;
		for(i=0;i<e.length;i++)
		{
			total=total + e[i].calsal();
		}
		return total;
        //System.out.println("Hello World!");
	}
}
