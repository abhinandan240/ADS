import java.util.Scanner;

public class LCM{
 static int hcf(int num1,int num2)
{
 if(num2!=0)
	{ 
	return hcf(num2,num1%num2);
	}
 else
	{
	return num1;
	}
}
 
 public static int lcm(int num1,int num2)
	{
		int lcm = (num1*num2)/hcf(num1,num2) ;   // LCM = (num1*num2 /HCF)
		return lcm ;
	} 

 
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);// take two numbers from user
  System.out.println("Enter num1");
  int num1 = sc.nextInt();
  System.out.println("Enter num2");
  int num2 = sc.nextInt();
  int hcf = hcf(num1,num2);
  int Result = lcm(num1,num2);
  System.out.println("LCM of "+num1+"  and  "+num2+"  is : "+Result);
 
 }
 
}