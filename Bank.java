package abcdjava;

	import java.util.Scanner;
	 class insufficientfundexception extends Exception {
		public insufficientfundexception(String msg)  {
			super(msg);
		}
	}


	public class Bank {
			int damount=2500;
			void deposit()
			{
				System.out.println("enter the deposit amount");
				Scanner sc=new Scanner(System.in);
				int x= sc.nextInt();
				damount +=x;
				System.out.println("Successfull Deposit");
				
				}
			 void withdraw() throws insufficientfundexception {
				System.out.println(" enter withdraw amount");
				Scanner cs=new Scanner(System.in);
				int y= cs.nextInt(); 
				if(y>damount) {
					throw new insufficientfundexception("amount is greater than balance amount");
				}
				else
				{
					damount= damount-y;
					System.out.println("succesful withdraw");
				}
			}
			 void BalanceCheck() {
				System.out.println("Your balance is: "+ damount);
			}
				public static void main(String[] args)
				{
					Bank obj = new Bank();
					obj.deposit();
					try
					{
						obj.withdraw();
					}
					catch(insufficientfundexception e) 
					{
						System.out.println(e.getMessage());
					}
					obj.BalanceCheck();
				}		
			}


