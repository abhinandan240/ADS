public class A2ques10
{
	public static boolean isPalindrome(String str)
	{
		if(str.length() <=1)
			{
				return true ;
			}
		else
			{
				return str.charAt(0) == str.charAt(str.length() -1 )&& isPalindrome(str.substring(1,str.length()-1));
			}
	}
	
	public static void main(String args[])
	{
		String str = "Democracy";
		if(isPalindrome(str))
			{
				System.out.println(str + " is a Palindrome .");
			}
		else
			{
				System.out.println(str + " is not a Palindrome .");
			}
	
		
	}
}