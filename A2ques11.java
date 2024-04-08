public class A2ques11
{
	public static int fibonaci(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fibonaci(n-1)+fibonaci(n-2);
		}
	}
	public static void reverseFibonaci(int n)
	{
		if(n<=0)
			{
				return ;
			}
		else
			{	
				System.out.print(fibonaci(n)+"  ");
				reverseFibonaci(n-1);
			}
	}
		
	public static void main(String args[])
	{

		int count =5 ;
		System.out.println("Fibonaci series in reverse order : ");
		reverseFibonaci(count);
	}
}