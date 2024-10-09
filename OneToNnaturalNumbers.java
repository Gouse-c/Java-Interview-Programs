import java.util.Scanner;
class OneToNnaturalNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter the End Point : ");
		int n=sc.nextInt();
		System.out.println("The Numbers are : ");
		for(int i=1;i<=n;i++)
		{
			if(i>10)
			{
				break;
			}
			System.out.println(i);
		}
	}
}