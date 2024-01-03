class area {
    int r = 5;
}

class circleArea extends area {
    public circleArea() {
        System.out.println("Area of Circle : " + (3.14 * r * r));
    }
}

class circumferenceArea extends area {
    public circumferenceArea() {
        System.out.println("Circumference of Circle : " + (2 * 3.14 * r));
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        circleArea c = new circleArea();
        circumferenceArea c1 = new circumferenceArea();
    }

}
