
import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum=0;
        int evensum=0;
        while(n!=0){
            int digit = n%10;
            if((digit)%2==0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
            n/=10;
        }
        System.out.println(Math.max(oddsum,evensum));

    }
}
