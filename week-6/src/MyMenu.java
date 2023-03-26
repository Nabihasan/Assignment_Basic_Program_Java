
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MyMenu {
	public static void main(String[] args) {
		ArrayList<Integer> elements = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		while (choice != 4) {
			System.out.println("\nMenu:");
			System.out.println("1. Add Elements");
			System.out.println("2. Remove Elements");
			System.out.println("3. Display Elements");
			System.out.println("4. Exit");

			System.out.print("Enter the choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Add the element: ");
				try {
					int add = sc.nextInt();
					elements.add(add);
					break;
				} catch (InputMismatchException e) {
					System.out.println("Enter the valid input type.....");

				}

			case 2:
				System.out.print("Remove the element: ");
				int remove = sc.nextInt();
				boolean removed = elements.remove(Integer.valueOf(remove));
				if (!removed) {
					System.out.println("There is no element.");
				}
				break;
			case 3:
				System.out.println("Elements are : " + elements);
				break;
			case 4:
				System.out.println("Exit..");
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}

		sc.close();
	}
}
