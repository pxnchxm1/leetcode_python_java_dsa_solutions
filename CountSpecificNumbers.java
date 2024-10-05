
import java.util.Scanner;

public class CountSpecificNumbers {
    public static boolean isvalid(int num){
    while(num!=0){
        int dig=num%10;
        if((dig!=4)&&(dig!=9)&&(dig!=1)){
            return false;
        }
    num/=10;
    }
    return true;
    }
    public static int helper(int m,int n){
        if(m>n){
            return -1;
        }  
        int count=0;
        for(int i=m;i<=n;i++){
            if(isvalid(i)){
            count++;
            }
            
        }
        
        return count;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println( helper(m,n));
       
    }
}
