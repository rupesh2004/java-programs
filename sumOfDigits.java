public class sumOfDigits {
    public static void main(String[] args) {
        int num=13454,dig,sum=0;
        while (num>0) {
            dig=num%10;
            sum=sum+dig;
            num=num/10;
        }
        System.out.println("sum of digits : " + sum);
    }
}
