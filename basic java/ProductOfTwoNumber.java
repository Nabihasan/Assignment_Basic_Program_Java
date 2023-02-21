import java.util.Scanner;
public class ProductOfTwoNumber{
		public static void main(String[] agg){
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first number...");
			int firstNumber=sc.nextInt();
			System.out.println("Enter the second number...");
			int secondNumber=sc.nextInt();
			
			int product = firstNumber * secondNumber;

			System.out.println("product of two number is : "+product);
		}

}