public class A2ques05
{
	public static String decimalToBinary(int decimal)
	{
		if(decimal ==0)
			{
				return "0";
			}
		else
			{
				return decimalToBinary(decimal/2)+decimal%2;
			}
	}
	
	public static void main(String args[])
	{
		int decimal = 20 ;
		String binary = decimalToBinary(decimal);
	
		System.out.println("Decimals in binary are : " +binary);
	}
}