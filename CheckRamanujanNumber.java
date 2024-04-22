 import java.util.Scanner;
 
 class RamanujanNumber
{
	public static boolean isRamanujanNumber( int n)
	{
		
		int count = 0;
		for(int i = 1 ; i*i*i<n ; i++ ) 
		{
		 for(int j = i+1 ; i*i*i+j*j*j<=n ;j++)
		 {
		  if(i*i*i +j*j*j == n)
		  {
		  count++;
		  }
		 }
		}
				return count>= 2 ;
	}
	
	
	
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int Number = sc.nextInt();
	if(isRamanujanNumber (Number))
	{
	System.out.println( Number + " : is a Ramanujan Number ");
	}
	else
	{
	System.out.println( Number + " : is not a Ramanujan Number ");
	}
	sc.close();
	}
}
