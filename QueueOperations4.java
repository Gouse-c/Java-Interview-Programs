import java.util.Scanner;
class QueueOverFlowException extends RuntimeException
{
	QueueOverFlowException(String msg)
	{
		super(msg);
	}
}
class QueueUnderFlowException extends RuntimeException
{
	QueueUnderFlowException(String msg)
	{
		super(msg);
	}
}
public class QueueOperations4
{
	static int front=-1,rear=-1;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Queue Operations : ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		while(true)
		{
			System.out.println("1 : insert()");
			System.out.println("2 : delete()");
			System.out.println("3 : display()");
			System.out.println("4 : exit()");
			System.out.println("Enter the choice : ");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1 :
				
					System.out.println("Enter the element to insert : ");
					int element = sc.nextInt();
					try
					{
						insert(a,element);
					}
					catch(QueueOverFlowException qe)
					{
						System.out.println(qe.getMessage());
					}
					break;
				case 2 :
					try
					{
						delete(a);
					}
					catch(QueueUnderFlowException qe)
					{
						System.out.println(qe.getMessage());
					}
					break;
				case 3:
					display(a);
					break;
				case 4:
					System.out.println("The program is to be exitted...");
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Operation..?Enter correct choice....");
			}
		}
	}
	public static void insert(int a[],int element)
	{
		if(rear==a.length-1)
		{
			throw new QueueOverFlowException("Queue is full...");
		}
		else
		{
			if(front==-1)
			{
				front=0;
			}
			a[++rear]=element;
			System.out.println("Inserted Element : "+element);
		}
	}
	public static void delete(int a[])
	{
		if(front==-1)
		{
			throw new QueueUnderFlowException("Queue is Empty...");
		}
		else
		{
			int deletedElement=a[front];
			if(front==rear)
			{
				front=rear=-1;
			}
			else
			{
				front++;
			}
			System.out.println("Deleted Element : "+deletedElement);
		}
	}
	public static void display(int a[])
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty...");
		}
		else
		{
			System.out.println("Queue Elements are : ");
			for(int i=front;i<=rear;i++)
			{
				System.out.println(a[i]+" ");
			}
			System.out.println();
		}
	}
}
				