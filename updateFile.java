import java.io.*;
public class updateFile {
    public static void main(String[] args) {
        String data;
        String newName="rupali bhosale";
        StringBuilder s = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\Programming\\Java\\External_Preactice\\info1.txt"));
){
            while ((data=br.readLine())!=null) {
                s.append(data).append("\n");
            }
            s.append(newName);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        try(BufferedWriter br1 = new BufferedWriter(new FileWriter("E:\\Programming\\Java\\External_Preactice\\info1.txt"));
){
                br1.write(s.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
    }
}
