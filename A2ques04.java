public class A2ques04
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
	
	public static void main(String args[])
	{
		int[] array = {1,2,3,4,5};
		int sum = sum(array,0);
	
		System.out.println("Sum of the array is : " +sum);
	}
}