import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			int res=num%10;
			num=num/10;
			sum=sum+(res*res*res);
		}
		if(temp==sum){
			System.out.print(temp +" is an Armstrong Number");
		}else{
			System.out.print(temp +" is not an Armstrong Number");
		}
	}
}