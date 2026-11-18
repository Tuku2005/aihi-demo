import java.util.*;
public class badVersion {
    static boolean firstBadVersion(int version){
        return version>=4;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
       
        int l=1;
        int r=n;
        while(l<r){
            int m= l+(r-l)/2;
            if(firstBadVersion(m)){
                r=m;
            }
            else{
                l=m+1;
            }
        }
        System.out.print("bad :"+l);
    }
}
