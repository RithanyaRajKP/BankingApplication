import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		BankAccount obj1=new BankAccount("ABC","BA001");
		obj1.showMenu();

	}
}
	class BankAccount{
		int balance;
		int previousTransation;
		String customerName;
		String customerId;
		public BankAccount( String customerName, String customerId) {
			super();
			this.customerName = customerName;
			this.customerId = customerId;
		}
		void deposite(int amount)
		{
			if(amount>0)
			{
				balance=balance+amount;
				previousTransation=amount;
			}
		}
		void withdraw(int amount)
		{
			if(amount>0)
			{
				balance=balance-amount;
				previousTransation= -amount;
			}
		}
		void getPreviousTransation()
		{
			if(previousTransation>0)
			{
				System.out.print("Deposited:" +previousTransation);
			}
			else if(previousTransation<0)
			{
				System.out.print("Withdrawn:" +Math.abs(previousTransation));
				
			}
			else
			{
				System.out.print("No transation occured");
			}
		}
		void showMenu(){
			char option='\0';
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome"+ customerName);
			System.out.println("Welcome"+ customerId);
			System.out.println("\n");
			System.out.println("A. Check Balance");
			System.out.println("B. Deposite");
			System.out.println("C. Withdraw");
			System.out.println("D. PreviousTransation");
			System.out.println("E. Exit");
			
			do {
				
				System.out.println("================================================================");
				System.out.println("Enter an option");
				option=sc.next().charAt(0);
				System.out.println("\n");
				switch(option)
				{
				case 'A' :
					System.out.println("================================================================");
					System.out.println("Balance" +balance);
					System.out.println("================================================================");
					System.out.println("\n");
					break;
				case 'B' :
					System.out.println("================================================================");
					System.out.println("Enter an amount to deposite");
					System.out.println("================================================================");
					int amount=sc.nextInt();
					deposite(amount);
					System.out.println("\n");
					break;
				case 'C' :
					System.out.println("================================================================");
					System.out.println("Enter an amount to deposite");
					//System.out.println("================================================================");
					int amount2=sc.nextInt();
					withdraw(amount2);
					System.out.println("\n");
					break;
				case 'D' :
					System.out.println("================================================================");
					getPreviousTransation();
					//System.out.println("================================================================");
					System.out.println("\n");
					break;
				case 'E' :
					System.out.println("****************************************************************");		
					break;
				default :
					System.out.println("Invalid option!!.Please enter again");		
					break;
				}
				
			}while(option!='E');
		}
		
	}


