import java.util.Scanner;
class Table
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table number : ");
		int t=sc.nextInt();
		System.out.println("\nEnter the start point : ");
		int a=sc.nextInt();
		System.out.println("\nEnter the End Point : ");
		int n=sc.nextInt();
		System.out.println("\nThe table are : ");
		for(int i=a;i<=n;i++)
		{
			//if(i%5!=0)
			//{
				System.out.println(t +" x"+ i +" =" + t*i);
			//}
		}
	}
}