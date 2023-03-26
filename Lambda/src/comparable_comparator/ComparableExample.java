package comparable_comparator;

public class ComparableExample implements Comparable<ComparableExample>{
	
	private int empId;
	private String empName;
	private double empSalary;
	
	
	@Override
	public int compareTo(ComparableExample o) {
	
		return this.empId-o.empId;
	}
	
	public ComparableExample(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.empSalary=empSalary;
		this.empName=empName;
		
		
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "ComparableExample [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	public ComparableExample getName() {
		// TODO Auto-generated method stub
		return null;
	}

	


	
	
}
