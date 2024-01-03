import java.io.*;

public class fetchData2 {
    public static void main(String[] args) {
        String data;
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Programming\\Java\\External_Preactice\\info.txt"))) {
            while((data=br.readLine())!=null) {
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
