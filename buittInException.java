public class buittInException {
    int a, b;
    String name;

    public buittInException(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
        try {
            if (b == 0) {
                throw new ArithmeticException("cannot divide by zero");
            } else {
                System.out.println(a / b);
            }
            if (name == null) {
                throw new NullPointerException("name is null");
            } else {
                System.out.println("valid name");
            }
            int number = Integer.parseInt(name);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException n) {
            System.out.println(n.getMessage());
        } catch (NumberFormatException n1) {
            System.out.println("invalid conversion "+n1);
        }

    }

    public static void main(String[] args) {
        buittInException ex = new buittInException(10, 2, "rupesh");
    }

}
