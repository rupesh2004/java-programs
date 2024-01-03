class custom extends Exception {
    public custom(String str) {
        super(str);
    }
}

public class even_odd_cusExp {
    public even_odd_cusExp(int num)throws custom {
        if(num%2 ==0){
            System.out.println("even");
        }else{
            throw new custom("odd");
        }
    }
    public static void main(String[] args) {
        try {
            even_odd_cusExp a = new even_odd_cusExp(3);
        } catch (custom c) {
            System.out.println(c.getMessage());
        }
    }
}
