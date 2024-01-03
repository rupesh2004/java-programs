public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int low=0,high=15,mid,key=106,flag=0;
        for(mid=(low+high)/2;low<=high;mid=(low+high)/2){
            if(key==arr[mid]){
                System.out.println("number found at " + mid);
                flag=1;
                break;
            }
            else if(arr[mid]>key){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        if(flag==0){
            System.out.println("number not found");
        }
    }
}
