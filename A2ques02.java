public class A2ques02
{
	public static int sum(int n)
	{
		if(n == 1)
		{
			return 1 ;
		}
		else
		{
			return n + sum(n-1);
		}
	}
	public static void main(String args[])
	{
		int n =10 ;
		int sum = sum(n);
		
		System.out.println("Sum of "+n+" Natural numbers is : "+sum);
	}

}