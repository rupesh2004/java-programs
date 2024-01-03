class custom extends Exception{
    public custom(String str){
        super(str);
    }
}
public class pos_neg_num_cusExp {
    public pos_neg_num_cusExp(int num) throws custom{
        if(num >= 0){
            System.out.println("positive");
        }else{
            throw new custom("negative");
        }
    }
    public static void main(String[] args) {
        try {
            pos_neg_num_cusExp pos = new pos_neg_num_cusExp(-4);
        } catch (custom c) {
            System.out.println(c.getMessage());
        }
    }
}

