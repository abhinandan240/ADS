 import java.util.Scanner;
 
 class Palindrome
{
	public static boolean isPalindrome( int n)
	{
	int originalNumber = n ;
	int reversedNumber = 0 ;
	
	while(n != 0)
	{
	int digit = n%10 ;
	 reversedNumber =reversedNumber*10 + digit ;
	 n/=10 ;
	}
	return originalNumber == reversedNumber ;
	
	}
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isPalindrome (Number))
	{
	System.out.println( Number + " : is a Palindrome Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Palindrome Number ");
	}
	sc.close();
	}
}
