import java.math.*;

public class finalAndStatic {
    public static void operation() {
        final float pi = 3.14f;
        int r = 4;
        System.out.println("area : " + (pi * r * r));
    }

    public static void main(String[] args) {
        finalAndStatic s = new finalAndStatic();
        operation();
        finalAndStatic.operation();
        s.operation();
    }

}
