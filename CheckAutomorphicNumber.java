 import java.util.Scanner;
 
 class Automorphic
{
	public static boolean isAutomorphic( int n)
	{
		
		int square =n*n;
		while(n>0)
		{
		 
			if(n%10 != square %10)
			{
			return false ;
			}
		  n/=10;
		  square/=10;
		}
		 return true ;
		
				
	}
	
	
	
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isAutomorphic (Number))
	{
	System.out.println( Number + " : is a Automorphic Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Automorphic Number ");
	}
	sc.close();
	}
}
