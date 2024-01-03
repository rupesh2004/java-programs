public class strToCharArr {
    public static void main(String[] args) {
        String name="rupesh";
        char[] nameArr = name.toCharArray();
        System.out.println(nameArr);
        for(char c : name.toCharArray()){
            System.out.println(c+" ");
        }
    }
}
