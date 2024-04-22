public class A2ques09
{
	public static int sumOfArrays(int[] arr,int index,int sum)
	{
		if(index == arr.length)
			{
				return sum;
			}
		else
			{
				return sumOfArrays(arr,index +1,sum+arr[index]);
			}
	}
	
	public static void main(String args[])
	{
		int[] array ={1,5,3,4,9} ;
		int result = sumOfArrays(array,0,0);
	
		System.out.println("Sum of arrays is  " +result);
	}
}