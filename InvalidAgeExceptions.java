package abcdjava;
import java.util.Scanner;
 class InvalidAgeException extends Exception{
		InvalidAgeException(String message)
		{
			super(message);
		}
 }
		public class InvalidAgeExceptions {
			void validate(int age) throws InvalidAgeException
			{
				if(age<18)
					throw new InvalidAgeException("you are not eligible to vote");
					else
						System.out.println("you are eligible to vote");
			
			}
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int age=sc.nextInt();
			InvalidAgeExceptions ob=new InvalidAgeExceptions();
			try {
				ob.validate(age);
			}
			catch(InvalidAgeException e) {
				System.out.println(e.getMessage());
			}
			
		}
	}