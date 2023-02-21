import java.util.Scanner;
public class StarPattern {

    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
        int r = sc.nextInt();

        for (int i = 0; i < r; i++) {

            for (int k = 1; k < r - i; k++) {

                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}