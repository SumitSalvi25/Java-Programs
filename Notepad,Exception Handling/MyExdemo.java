import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  EX
{
	int num1,num2,res;
	public EX()
	{
		num1=1;
		num2=0;
	}
	public void divide() throws ArithmeticException
	{
		res=num1/num2;
		
		/*catch(ArithmeticException f)
		{
		System.out.println("Cannot divide by zero");
		}*/
	}
	public void display()
	{
		System.out.println("Result is:"+res);
	}
}
class MyExdemo
{
	public static void main(String args[])
	{
		EX e=new EX();
		try{
			e.divide();
			}
		catch(ArithmeticException f)
		{
		System.out.println("Cannot divide by zero");
		}
		e.display();
	}
}