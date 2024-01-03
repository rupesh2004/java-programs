import java.io.*;

public class writeFile {
    public static void main(String[] args) throws Exception {
        String filePath = "E:\\Programming\\Java\\External_Preactice\\info.txt";
        String name = "rupesh";
        int id = 2253006;
        int pointer = 8;

        try(BufferedWriter br = new BufferedWriter(new FileWriter(filePath));) { 
            br.write(name);
            br.newLine();
            br.write(Integer.toString(id));
            br.newLine();
            br.write(Integer.toString(pointer));
            System.out.println("writted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
