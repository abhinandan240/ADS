 import java.util.Scanner;
 
 class PrimeNumber
{
	public static boolean isPrime( int n)
	{
		if(n<=1)
			{	
			return false ;
			}
		for(int i=2 ; i <= Math.sqrt(n);i++) // if n 7  2 <49    if n=8   2<64
		{
			if(n%i ==0)    //7% 2 is not equal to 0      8%2 is equal to 0 cond fails 
				{
				return false;      // returns false id cond fails    
				}
		
		}
	return true ;  // 7 is prime so return true 
	
	}
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isPrime (Number))
	{
	System.out.println( Number + " : is a Prime Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Prime Number ");
	}
	sc.close();
	}
}
