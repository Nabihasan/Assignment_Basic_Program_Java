package Employee;

public class EmployeeManagement {

    private String empName;
    private String empId;
    private String mobileNumber;
    private String designation;
    private double salary;

    public String getName() {
        return empName;
    }

    public void setName(String name) {
        this.empName = name;
    }
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }


    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

   
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name=" + empName + ",Employee Id=" + empId + ", Mobile Number=" + mobileNumber + ",Employee designation=" + designation + ", Salary=" + salary;
    }

    public EmployeeManagement() {
    }

    public EmployeeManagement(String name,String empId, String mobileNumber, String designation, double salary) {
        this.empName = name;
        this.empId = empId;
        this.mobileNumber = mobileNumber;
        this.designation = designation;
        this.salary = salary;
    }

}