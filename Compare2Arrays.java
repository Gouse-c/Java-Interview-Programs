import java.util.Scanner;
class Compare2Arrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the size of n1 : ");
		int n1 =sc.nextInt();
		System.out.println("Enter the size of n2 : ");
		int n2 =sc.nextInt();
		System.out.println("Enter the size of n3 : ");
		int n3 =sc.nextInt();
		System.out.println("Enter the a array elements : ");
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=a;
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		if(a==b)
		{
			System.out.println("a and b array elements are same ...");
		}
		else
		{
			System.out.println("a and b array elements are not same : ");
		}
		System.out.println("Enter the c arraay elements : ");
		int c[]=new int[n3];
		for(int i=0;i<n1;i++)
		{
			c[i]=sc.nextInt();
		}
		if(a==c)
		{
			System.out.println("a and c array elements are same ...");
		}
		else
		{
			System.out.println("a and c array elements are not same : ");
		}
}
}