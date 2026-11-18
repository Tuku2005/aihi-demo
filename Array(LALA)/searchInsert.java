import java.util.*;
public class searchInsert {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] =sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int tar=sc.nextInt();
        while(left<=right){
            int mid= left+(right-left)/2;
            if(arr[mid]== tar){
                System.out.print(mid);
                return ;
            }
            else if(arr[mid]<tar){
                left= mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.print(left);
    }
}
