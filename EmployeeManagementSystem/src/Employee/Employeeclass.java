package Employee;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Employeeclass {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        EmployeeManagement emp = new EmployeeManagement();
        BufferedWriter writer = null;

        while (true) {
            try {
                writer = new BufferedWriter(new FileWriter("E:\\program core java\\employee.txt", true));

            } catch (IOException e) {
                System.out.println(e);
            }

            System.out.print("Enter First Name (or quit for exit) = ");
            String fname = sc.next();
            if (fname.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.print("Enter Last Name = ");
            String lname = sc.next();

            String name = fname + " " + lname;
            emp.setName(name);
            System.out.print("Enter EmpID = ");
            emp.setEmpId(sc.next());

            System.out.print("Enter Mobile = ");
            emp.setMobileNumber(sc.next());

            System.out.print("Enter Designation = ");
            emp.setDesignation(sc.next());

            System.out.print("Enter Salary = ");
            emp.setSalary(sc.nextDouble());

            writer.write(emp.toString() + "\n \n");
            writer.close();
            System.out.println("\n" + emp + "\n");

        }

        System.out.println("\n The data has been completed..........");
    }

}