public class A2ques06
{
	public static int sumOfDigits(int number)
	{
		if(number == 0)
			{
				return 0;
			}
		else
			{
				return number%10 + sumOfDigits(number/10);
			}
	}
	
	public static void main(String args[])
	{
		int number = 25457 ;
		int sum = sumOfDigits(number);
	
		System.out.println("Sum of Digits is  " +sum);
	}
}