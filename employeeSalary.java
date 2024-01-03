interface calculateSal {
    public void calculateSalary();
}

class employee implements calculateSal {
    int hoursWorked, hoursRate;

    public employee(int hoursWorked, int hoursRate) {
        this.hoursWorked = hoursWorked;
        this.hoursRate = hoursRate;
    }

    public void calculateSalary() {
        System.out.println("Employee Salary : " + (hoursWorked * hoursRate));
    }
}

class Hr implements calculateSal {
    int hoursWorked, hoursRate;

    public Hr(int hoursWorked, int hoursRate) {
        this.hoursRate = hoursRate;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        System.out.println("HR Salary : " + (hoursWorked * hoursRate));
    }
}

public class employeeSalary {
    public static void main(String[] args) {
        employee e = new employee(600, 500);
        e.calculateSalary();
        Hr h = new Hr(600, 1000);
        h.calculateSalary();
    }

}
