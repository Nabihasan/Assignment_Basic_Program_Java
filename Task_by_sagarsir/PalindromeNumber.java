import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
        int number = sc.nextInt();
        for(int i = 1; i < number; i++)
        {
          System.out.print(i + " ");  
        }
        
        for(int i = number-2; i > 0; i--)
        {
          System.out.print(i + " ");  
        }
    }
}