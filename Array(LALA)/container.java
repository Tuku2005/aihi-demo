import java.util.*;
public class container {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n ;i++){
            arr[i]= sc.nextInt();
        }
        int s=0;
        int e=n-1;
        int maxA=0;
        while(s<e){
            int h= Math.min(arr[s],arr[e]);
            int w= e-s;
            int A= h*w;
            maxA=Math.max(A,maxA);
            if(arr[s]<arr[e]){
                s++;
            }
            else{
                e--;
            }
        }
        System.out.print(maxA);
    }
}
