package ja;

public class ma {
	public static void main(String[] args) {
//sum and average of array
		   int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		   int sum = 0;
		   Double average;
		   for (int number: numbers) {
		     sum += number;
		   }
		   int arrayLength = numbers.length;	   
		   average =  ((double)sum / (double)arrayLength);

		   System.out.println("Sum = " + sum);
		   System.out.println("Average = " + average);
		 }
}
