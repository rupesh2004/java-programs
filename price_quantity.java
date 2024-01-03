import java.io.*;
public class price_quantity {
    int price,quantity,discount,finalBill;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public void getdata()throws Exception{
        System.out.println("Enter Price of Item : ");
        price = Integer.parseInt(br.readLine());
        System.out.println("Enter Quantity of Item : ");
        quantity = Integer.parseInt(br.readLine());  
    }
    public void operation(){
        int totalBill = price*quantity;
        if (quantity>50) {
            discount=quantity*2;
            finalBill = totalBill-discount;
            System.out.println("Discounted Price : "+finalBill);
        }else{
            System.out.println("Total Price : "+totalBill);
        }
    }
    public static void main(String[] args) throws Exception{
        price_quantity p = new price_quantity();
        p.getdata();
        p.operation();
    }
}
