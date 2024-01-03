class emp_1 {
	private int empid;
	String nm;
	Float salary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empnumber) {
		this.empid = empnumber;
	}

	public String getName() {
		return nm;
	}

	public void setName(String nm) {
		this.nm = nm;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		emp_1 e = new emp_1();
		e.setName("Rupesh");
		e.setEmpid(2253006);
		e.setSalary(20000.0f);

		System.out.println("Name : " + e.getName());
		System.out.println("Salary : " + e.getSalary());
		System.out.println("Empid : " + e.getEmpid());
	}
}