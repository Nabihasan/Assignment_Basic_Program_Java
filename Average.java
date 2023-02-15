import java.util.Scanner;
                 
public class Average
{
    public static void main(String args[])
  {
    
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first Numbers : ");
    int first = scanner.nextInt();
    System.out.println("Enter Second Numbers : ");
    int second = scanner.nextInt();
    System.out.print("Enter third Numbers : ");
   int third = scanner.nextInt();

    float average = (first+second+third)/3;


    System.out.println("Average of three Numbers is = " + average);
    
  }
}