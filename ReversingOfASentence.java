import java.util.Scanner;
class ReversingOfASentence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		System.out.println("Before Reversing : ");
		System.out.println(str);
		char str1[]=str.toCharArray();
		System.out.println("After Reversing : ");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]);
		}
	}
}		