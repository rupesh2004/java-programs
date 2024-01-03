class vehicle {
    public String make, model, year, fuleType;

}

class turck extends vehicle {
    int fuleCapacity;
    int fuleEfficiency;

    public turck(String make, String model, String year, String fuleType, int fuleCapacity, int fuleEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuleType = "Diesel";
        this.fuleCapacity = fuleCapacity;
        this.fuleEfficiency = fuleEfficiency;
        calculateDistance();
        display();
    }

    public void calculateDistance() {
        System.out.println("Distance travelled by Truck : " + (fuleCapacity / fuleEfficiency));
    }

    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Fule Type : " + fuleType);
    }
}

class car extends vehicle {
    int fuleCapacity;
    int fuleEfficiency;

    public car(String make, String model, String year, String fuleType, int fuleCapacity, int fuleEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuleType =fuleType;
        this.fuleCapacity = fuleCapacity;
        this.fuleEfficiency = fuleEfficiency;
        calculateDistance();
        display();
    }

    public void calculateDistance() {
        System.out.println("Distance travelled by Car : " + (fuleCapacity / fuleEfficiency));
    }

    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Fule Type : " + fuleType);
    }
}


class moterCycle extends vehicle {
    int fuleCapacity;
    int fuleEfficiency;

    public moterCycle(String make, String model, String year, String fuleType, int fuleCapacity, int fuleEfficiency) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuleType =fuleType;
        this.fuleCapacity = fuleCapacity;
        this.fuleEfficiency = fuleEfficiency;
        calculateDistance();
        display();
    }

    public void calculateDistance() {
        System.out.println("Distance travelled by Moter Cycle : " + (fuleCapacity / fuleEfficiency));
    }

    public void display() {
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Fule Type : " + fuleType);
    }
}

public class main_class {
    public static void main(String[] args) {
        vehicle v = new vehicle();
        turck t = new turck("Tata", "F-111", "2023", "Diesel", 150, 3);
        car c = new car("Toyota", "Fortuner", "2023", "Pertrol", 30, 3);
        moterCycle m = new moterCycle("Hero", "Splender", "2023", "Pertrol", 12, 3);
    }

}
