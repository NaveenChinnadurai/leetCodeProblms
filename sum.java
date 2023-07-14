import java.util.Arrays;

public class array {
    public static void main(String[] args){
        int arr[]={3,3};
        int target=6;
        int arr1[]=new int[2];
        for (int i=0;i<arr.length;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if((arr[i]+arr[j])==target){
                    arr1[0]=i;
                    arr1[1]=j;
                    System.out.println(Arrays.toString(arr1));
                    break;
                }
            }
        }
    }
}