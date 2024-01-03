interface area {
    public void calculateArea();
}

class circleArea implements area {
    int r;
    float pi;

    public circleArea(int r) {
        pi = 3.14f;
        this.r = r;
    }

    public void calculateArea() {
        System.out.println("Area of circle : " + (pi * r * r));
    }
}

class reacangleArea implements area {
    int l, b;

    public reacangleArea(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public void calculateArea() {
        System.out.println("Area of rectangle : " + (l * b));
    }
}

class miltipleInheritance {
    public static void main(String[] args) {
        circleArea c = new circleArea(5);
        c.calculateArea();
        reacangleArea r = new reacangleArea(6, 7);
        r.calculateArea();
    }
}