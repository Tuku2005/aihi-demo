import java.util.Scanner;

public class FstLastOcuurence {
    static int firstOccurrence(int[] arr, int tar){
        int left=0;
        int right=arr.length-1;
        int first=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(arr[mid]==tar){
                first= mid;
                right=mid-1;
            }
            else if(arr[mid] <tar){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return first;

    }
     static int lastOccurrence(int[] arr, int tar){
        int left=0;
        int right=arr.length-1;
        int last=-1;
        while(left<=right){
            int mid= left+(right-left)/2;
            if(arr[mid]==tar){
                last= mid;
                left=mid+1;
            }
            else if(arr[mid] <tar){
                left=mid+1;
            }
            else{
                right=mid-1;
            }

        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++  ){
            arr[i] = sc.nextInt();
        }
        int tar= sc.nextInt();
        int first= firstOccurrence(arr,tar);
        int last= lastOccurrence(arr,tar);
        System.out.print("FirstOccurrence :" + first);
        System.out.print("LastOccurrence :" + last);
    }
}
