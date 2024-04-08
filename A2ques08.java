public class A2ques08
{
	public static int stringKiLength(String str)
	{
		if(str.equals(""))
			{
				return 0;
			}
		else
			{
				return 1 + stringKiLength(str.substring(1));
			}
	}
	
	public static void main(String args[])
	{
		String str = "hey Abhi";
		int length = stringKiLength(str);
	
		System.out.println("Length of String "+str+ " is "+length);
	}
}