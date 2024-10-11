public class FrequencyArray
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,4,5,6,2,1,4,5,6,7,8,9};
		int fre[]=new int[1000];
		for(int i=0;i<arr.length;i++)
		{
			fre[arr[i]]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(fre[i]>0)
			{
					System.out.println(i+"is repeated in :"+fre[i]+" times");
			}
		}
	}
}