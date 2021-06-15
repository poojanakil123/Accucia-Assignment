import java.util.*;
public class AccountInfo
{
	
		public static void main(String[] args)
		{
			Account obj = new Account();
				obj = getAccountDetails();
				//int c = getWithdrawAmount();
				getAmountOptions(obj);
				//obj.withdraw(c);
		}
		
		 public static Account getAccountDetails()
		{
			Account acc=new Account();
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Account Holder Name: ");
			acc.setAccountType(sc.nextLine());
			int b;
			do
			{
			System.out.println("Enter Account Balance: ");
			acc.setBalance(sc.nextInt());
			b=acc.getBalance();
			if(b<=0)
			System.out.println("Balance should be positive");
			}
			while(b<=0);
			return acc;
		}
		
		public static void enterBalance(Account acc)
		{
			
			Scanner sc=new Scanner(System.in);
			int b = acc.getBalance();
			do
			{
			System.out.println("Add Money: ");
			acc.setBalance(b+sc.nextInt());
			b=acc.getBalance();
			if(b<=0)
			System.out.println("Balance should be positive");
			}
			while(b<=0);
			
			System.out.println("Total Account Balance is: "+b);
			
		}
		
		public static void withdrawBalance(Account acc)
		{
			Scanner sc=new Scanner(System.in);
			int input =0;
			int b = acc.getBalance();
			do
			{

				System.out.println("Withdraw Money: ");
				input = sc.nextInt();
				if(b<=0)
				{
					System.out.println("Balance should be positive");
				}
				else if(b<input)
				{
					System.out.println("Not enough balance.!!");
				}
				else if(input > 2000)
				{
					System.out.println("Sorry, You can withdraw balance upto 2000 only...");
				}
				else{
					acc.setBalance(b-input);	
				}
				
			}		
			while(b<=0 || b<input || input > 2000);
			
			System.out.println("Total Account Balance is: "+acc.getBalance());
		}
		
		public static void getAmountOptions(Account obj)
		{
			Scanner sc=new Scanner(System.in);
			int w;
			do
			{
				System.out.println("Select Any Option: \n1:Add Cash\n2:Withdraw Cash\n3:Exit");
				w=sc.nextInt();
				if(w<=0 || w>3)
				{
					System.out.println("Select Proper Option");
				}
				else if(w==1)
				{
					enterBalance(obj);
				}
				else if(w==2)
				{
					withdrawBalance(obj);
				}
			}
			while(w!=3);
			
			
			

		}
		
		public static int getWithdrawAmount()
		{
			Scanner sc=new Scanner(System.in);
			int w;
			do
			{
				System.out.println("Enter amount to be withdrawn:");
				w=sc.nextInt();
				if(w<=0)
				System.out.println("Amount should be positive");
			}
			while(w<=0);
			return w;
		}
	
		public static class Account
		{
			private int accountId;
			private String accountType;
			private int balance;
			public int getAccountId()
			{
				return accountId;
				
			}
			public String getAccountType()
			{
				return accountType;
			}
			public int getBalance()
			{
				return balance;
				
			}
			public void setAccountId(int id)
			{
				accountId=id;
			}
			public void setAccountType(String s)
			{
				accountType=s;
			}
			public void setBalance(int b)
			{
				balance=b;
			}
			
		}
	
	
}
