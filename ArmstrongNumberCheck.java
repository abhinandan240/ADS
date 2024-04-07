 import java.util.Scanner;
 
 class ArmstrongNumber
{
	public static boolean isArmstrongNumber( int n)
	{
		int originalNumber = n ;
		int sum = 0;
		int numberOfDigits = countDigits(n);
	    
		while(n>0)
			{
			int digit = n%10 ;
			sum += Math.pow(digit,numberOfDigits);
			n/=10;
			}
			return originalNumber == sum ;
				
	}
	
	public static int countDigits(int n)
	{
	 int count = 0 ;
		while(n>0)
			{
			count++;
			n/=10 ;
			}
	 return count ;
	}
	
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isArmstrongNumber (Number))
	{
	System.out.println( Number + " : is a Armstrong Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Armstrong Number ");
	}
	sc.close();
	}
}
