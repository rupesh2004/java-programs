public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int key=756,flag=0;
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==key){
                System.out.println("number found at " +i);
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("number not found");
        }
    }
}
