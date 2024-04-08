public class A2ques07
{
	public static void reverse(String str ,int index)
	{
		if(index< str.length())
			{
				reverse(str,index + 1);	
				System.out.print(str.charAt(index));
			}
		
	}
	
	public static void main(String args[])
	{
		
		String str = "Hello Abhi ";
		reverse(str,0);
		
	}
} 