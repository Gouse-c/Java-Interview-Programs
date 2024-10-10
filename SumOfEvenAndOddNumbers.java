import java.util.Scanner;
class SumOfEvenAndOddNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the size of n : ");
		int n=sc.nextInt();
		int sum=0;
		int sum1=0; 
		System.out.println("The Sum of the Even Numbers are : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		System.out.println("The Sum of the Odd Numbers are : ");
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum1=sum1+i;
			}
		}
		System.out.println(sum1);
	}
}
