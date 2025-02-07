public class MaximumElementInArray
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.println("Please Enter the array of integers through command Line");
			return;
		}
		int a[]=new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int maxElement=findMaxElement(a);;
		System.out.println("Maximum Element in the array is : "+maxElement);
	}
	private static int findMaxElement(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		return max;
	}
}