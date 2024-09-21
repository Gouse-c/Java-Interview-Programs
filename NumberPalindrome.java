import java.util.Scanner;
class NumberPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int orgNum=num;
		int revNum=0;
		while(num!=0)
		{
			int rem=num%10;
			revNum=(revNum*10)+rem;
			num=num/10;
		}
		if(revNum==orgNum)
		{
			System.out.println("It is a palindrome number...");
		}
		else
		{
			System.out.println("It is not a Palindrome number...");
		}
	}
}