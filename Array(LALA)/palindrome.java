import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter:");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++  ){
            arr[i]= sc.nextInt();
        }
      
        int st=0;
        int end=n-1;
        while(st<end){
            if(arr[st] != arr[end]){
                System.out.print("not pal");
                break;
            }
            st++;
            end--;
        }
        System.out.print("pal");
    }
}
