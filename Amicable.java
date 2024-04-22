import java.util.Scanner ;

public class Amicable
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2 :");
		int num2 = sc.nextInt();
	
	
		
	
		int res1 = 0 ;
		int res2 = 0 ;

		for(int i= 1 ;i <=num1/2 ;i++)
		{
			if(num1%i == 0)
				{
					res1+=i;
				}
		}
		for(int i= 1 ; i <=num2/2 ;i++)
		{
			if(num2%i == 0)
				{
					res2+=i;
				}
		}
	
		if(res2 ==num1 && res1==num2)
			{
				System.out.println(num1+" and "+num2+ " are Amicable number " );
			}
		else
			{
				System.out.println(num1+" and "+num2+ " are  not Amicable number " );
			}
		
	}

}