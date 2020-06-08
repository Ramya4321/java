/*aim: 
5. Implement any one of the case study with the
 specifications given below:
a) Create classes, objects and their properties.
b) Add methods to classes and implement them.
c) Refine the objects by adding constructors and local
variables.
d) Show communication between the objects by calling
instance of one object from another class.
e) Handle Exceptions and Implement relationships like
inheritance.
Case study 1: Banking Application:
The banking application consists of five divisions. They are
customer details, creating a new account, withdrawing money,
loan details and depositing money. The customer details consist
of customer name, address, phone number, account number.
To withdraw money checks the balance in the account and
then get the money. The loan details consist of loan types like
home loans, car loans, education loans etc. To deposit money
enter the account number and give the account to be
deposited.
*/
import java.lang.*;
import java.util.*;
class account
{
	String name;
	String address;
	double phno;
	int accno;
	float bal;
	void create()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter name:");
		name=sc.nextLine();
		System.out.print("enter address");
		address=sc.nextLine();
		System.out.print("enter phone no.");
		phno=sc.nextDouble();
		System.out.print("enter account no.");
		accno=sc.nextInt();
		System.out.print("enter amount to be deposited:");
		bal=sc.nextFloat();
	}
}
class LowBalException extends Exception
{
	
}
class customer extends account
{
	customer()
	{
		create();
	}
	float amount;
	void deposit()
	{
		System.out.print("\nenter amount:");
		Scanner sc=new Scanner(System.in);
		amount=sc.nextFloat();
		bal=bal+amount;
		System.out.println("deposited");
	}
	void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter amount");
		amount=sc.nextFloat();
		try
		{
			if(amount>bal)
				throw new LowBalException();
			else
			{
				bal=bal-amount;
				System.out.println("amount withdrawal");
			}
		}
		catch(LowBalException ex)
		{
			System.out.println("in sufficient amount");
		}
	}
	void display()
	{
		System.out.println("name is:"+name);
		System.out.println("address is:"+address);
		System.out.println("phone no.is:"+phno);
		System.out.println("account no is:"+accno);
		System.out.println("balance is:"+bal);
	}
}
class loan extends account
{
	String type;
	double amount;
	void sanction(customer c)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter type of loan:personal loan ,home loan , education loan");
		type = sc.nextLine();
		System.out.println("enter amount :");
		amount = sc.nextDouble();
	}
	void displayloan()
	{
		System.out.println("name of customer "+name);
		System.out.println("type of loan "+type);
		System.out.println("amount to be loaned "+amount);
	}
}
class BankCaseStudy
{
	public static void main(String args[])
	{
		int n,i,j,ch,ac;
		System.out.print("enter maximum no. of customers:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		customer c[]=new customer[n];
		loan l[]=new loan[n];
		i=0;
		while(true)
		{
			System.out.println("1->create account\n 2->deposit\n 3->withdraw\n 4->display\n 5->sanction loan\n 6->display loan\n 7->exit\n");
			System.out.print("enter your choice:");
			ch=sc.nextInt();
			if(ch==1)
			{
				c[i]=new customer();
				i++;
			}
			else if(ch==2||ch==3||ch==4||ch==5||ch==6)
			{
				System.out.print("enter account number:");
				ac=sc.nextInt();
				for(j=0;j<=i;j++)
				{
					if(ac==c[j].accno)
					{
						if(ch==2)
							c[j].deposit();
						else if(ch==3)
							c[j].withdraw();
						else if(ch==4)
							c[j].display();
						else if(ch==5)
						{
							l[j]=new loan();
							l[j].sanction(c[j]);
						}
						else if(ch==6)
							l[j].displayloan();
						break;
					}
				}
			}
			else if(ch==7)
			System.exit(0);
		}
		
	}
	
}
/*
output:
enter maximum no. of customers:2
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:1
enter name:ramya
enter address2354
enter phone no.234
enter account no.23
enter amount to be deposited:10000
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:1
enter name:bvcsfgs
enter address33333
enter phone no.1324
enter account no.1
enter amount to be deposited:20000
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:2
enter account number:23

enter amount:2000
deposited
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:3
enter account number:23
enter amount
2535
amount withdrawal
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:4
enter account number:23
name is:ramya
address is:2354
phone no.is:234.0
account no is:23
balance is:9465.0
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:5
enter account number:1
enter type of loan:personal loan ,home loan , education loan
personal
enter amount :
5000
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:6
enter account number:1
name of customer null
type of loan personal
amount to be loaned 5000.0
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:3
enter account number:23
enter amount
50000
in sufficient amount
1->create account
 2->deposit
 3->withdraw
 4->display
 5->sanction loan
 6->display loan
 7->exit

enter your choice:7
*/