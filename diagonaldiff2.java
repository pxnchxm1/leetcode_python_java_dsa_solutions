
import java.util.Scanner;

public class diagonaldiff2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int lsum=0;
        int rsum=0;
        
            for(int i=0;i<n;i++){
                lsum+=arr[i][i];
            }
            for(int i=0,j=n-1;i<n;i++){
                rsum+=arr[i][j];
                j--;
            }
            if(n%2!=0)
                System.out.println(Math.abs(lsum+rsum-arr[n/2][n/2]));
            else
                System.out.println(lsum-rsum);
        
        

    }
}
