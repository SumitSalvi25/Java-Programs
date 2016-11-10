class Refhastwovar
{
static int tot;
	public static void main(String args[])
    {
     Employee e[]=new Employee[4];
	 e[0]=new Employee(/*pass parametrs*/);
	 e[1]=new WageE();
	 e[2]=new SP();
	 e[3]=new Manage();
	 UtilityEmp ue=new UtilityEmp();
	tot=ue.CalTotalSal(e);
	System.out.println("Total salary is"+tot);
	
	}
}
class UtilityEmp
{
public int CalTotalSal(Employee e[])
	{
		  int total=0;
		  int i=0;
	  for(i=0;i<e.length;i++)
		{
		  total=total + e[i].CalSal();
           
        }
	   return total;
	 
	}

}	
 



