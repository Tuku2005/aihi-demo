import java.util.*;
public class linear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int idx=-1;
        int tar= sc.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==tar){
                idx=i;
                break;
            }
        }
        System.out.print(idx);
    }
}
