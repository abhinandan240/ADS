 import java.util.Scanner;
 
 class PerfectNumber
{
	public static boolean isPerfectNumber( int n)
	{
		
		int sum = 0;
		for(int i = 1 ; i<=n/2 ; i++ ) 
		{
		 if(n%i ==0)
		 {
		  sum+=i ;
		 }
		}
				return sum == n ;
	}
	
	
	
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isPerfectNumber (Number))
	{
	System.out.println( Number + " : is a Perfect Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Perfect Number ");
	}
	sc.close();
	}
}
