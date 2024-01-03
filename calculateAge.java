import java.util.*;
import java.text.*;

public class calculateAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String birthdateString = scanner.nextLine();

        Date birthDate = parseDate(birthdateString);
        int age = calculateAge(birthDate);

        System.out.println("Your age is: " + age + " years");

        scanner.close();
    }
    public static Date parseDate(String birthdateString) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(birthdateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int calculateAge(Date birthDate) {
        long ageInMillis = System.currentTimeMillis() - birthDate.getTime();
        return (int) (ageInMillis / (365 * 24 * 60 * 60 * 1000L));
    }
}
