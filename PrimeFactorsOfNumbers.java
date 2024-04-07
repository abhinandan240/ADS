 import java.util.Scanner;
 
 class PrimeFactors
{
	public static void factors( int n)
	{
	while(n%2 == 0)
	{
	System.out.print(2+" , ");
	 n/=2 ;
	}
	for(int i = 3 ; i*i <=n ; i+= 2 )
	{
		while(n%i ==0)
		{
			System.out.println(i +" ");
			n/=i ;
		}
	}
	if(n>2)
		{
			System.out.println(n);
		}
	}
  public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Given Number");
	int givenNumber = sc.nextInt();
	
	System.out.println("Prime factors of "+ givenNumber + " are : ");
 
	factors(givenNumber);
	sc.close();
	}
}
