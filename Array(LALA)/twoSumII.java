import java.util.*;
public class twoSumII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++ ){
            arr[i]= sc.nextInt();
        }
        int s=0; 
        int e=n-1;
        int tar= sc.nextInt();
        while(s<e){
            int sum= arr[s]+arr[e];
            if(sum==tar){
                System.out.print((s+1) +" "+ (e+1));
                break;
            }
            else if(sum<tar){
                s++;
            }
            else{
                e--;
            }
        }
    }
}
