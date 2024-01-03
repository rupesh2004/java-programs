class emplyee {
    String name;
    int salary;

    public emplyee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println(name + " is working");
    }

    public int getSalary() {
        return salary;
    }
}

class HRManager extends emplyee {
    public HRManager(String name, int salary){
        super(name, salary);

    }
    @Override
    public void work(){
        System.out.println(getName() + " is working as HR Manager");
    }

    public void addEmployee(){
        System.out.println(getName() + " is added");
    }
    public static void main(String[] args) {
        emplyee e = new emplyee("rupesh", 20000);
        e.work();
        e.getSalary();

        HRManager h = new HRManager("reshma", 90000);
        h.work();
        h.addEmployee();
    }
}
