import java.util.Scanner;

public class smallLetterGreaterThanTarget {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size: ");
        int n= sc.nextInt();
        char[] letter= new char[n];
        for(int i=0; i<n; i++)  {
            letter[i]=sc.next().charAt(0);
        }
        char tar= sc.next().charAt(0);
        int st=0;
        int end= letter.length-1;
        while(st<=end){
            int mid= st+(end-st)/2;
            if(letter[mid]<=tar){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        char ans= letter[st%letter.length];
        System.out.print("ans:"+ans);
    }
}
