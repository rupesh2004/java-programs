public class grades {
    public static void main(String[] args) {
        int grade = 65;
        if(grade>=80 && grade <=100){
            System.out.println("Grade A");
        }
        else if(grade>=60 && grade < 80){
            System.out.println("Grade B");
        }else if(grade >=40 && grade <60){
            System.out.println("Grade C");
        }else {
            System.out.println("fail");
        }
    }
}
