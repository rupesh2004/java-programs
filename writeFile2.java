import java.io.*;

public class writeFile2 {
    public static void main(String[] args) {
        String name = "rupesh";
        int id = 2253006;

        try (BufferedWriter br = new BufferedWriter(
                new FileWriter("E:\\Programming\\Java\\External_Preactice\\info1.txt"));) {

            br.write(name);
            br.write(String.valueOf(id));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
