import java.util.Scanner;

public class MountainArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++ ){
            arr[i] = sc.nextInt();
        }
        int i=0;
        while( i<n-1 && arr[i]<arr[i+1]){
            i++;
        }
        if(i==0 || i==n-1){
            System.out.print("false");
            return;
        }
        while(i<n-1 && arr[i]>arr[i+1]){
            i++;
        }
        System.out.print(i==n-1);
    }
}
