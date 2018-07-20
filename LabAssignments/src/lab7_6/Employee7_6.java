//Assignment Lab 7_6

package lab7_6;


public class Employee7_6 implements Comparable<Employee7_6>
{
	int empId;
	String empName;
	double empSalary;
	String empDesignation;
	String empInsuranceScheme;
	
	
	
	public Employee7_6() {
		super();
		
	}




	public Employee7_6(int empId, String empName, double empSalary,
			String empDesignation, String empInsuranceScheme) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDesignation = empDesignation;
		this.empInsuranceScheme = empInsuranceScheme;
	}




	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpDesignation() {
		return empDesignation;
	}
	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}
	 public String getEmpInsuranceScheme() {
		return empInsuranceScheme;
	}
	public void setEmpInsuranceScheme(String empInsuranceScheme) {
		this.empInsuranceScheme = empInsuranceScheme;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + empId + ", Name=" + empName
				+ ", Salary=" + empSalary + ", Designation="
				+ empDesignation + ", InsuranceScheme=" + empInsuranceScheme
				+ "]";
	}


	@Override
	public int compareTo(Employee7_6 o) 
	{
		if (this.empSalary == ((Employee7_6) o).empSalary)
			return 0;
		else if (this.empSalary > ((Employee7_6) o).empSalary)
			return 1;
		else
			return -1;
		
	}

}
