package assesment3;

public class Trycatch1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBounds Exception error");
		}
		catch(Exception e)
		{
			System.out.println("Parent exception error");
			}
		System.out.println("remaining code");
		}

}
