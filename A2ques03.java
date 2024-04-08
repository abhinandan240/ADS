public class A2ques03
{
	public static int sum(int[] arr,int index)
	{
		if(index == arr.length - 1)
			{
				return arr[index];
			}
		else
			{
				return arr[index] + sum(arr,index+1);
			}
	}
	public static double Mean(int[] arr,int index)
	{
		if(index == arr.length - 1)
			{
				return (double)arr[index]/arr.length ;
			}
		else
			{
				return ((double)arr[index] + sum(arr,index+1))/arr.length ;
			}
	}
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5};
		double mean = Mean(array,0);
	
		System.out.println("Mean of the array is : " +mean);
	}
}