
import java.util.Scanner;

public class Hill {
    public static boolean hill(int[] arr){
        boolean reachedtop= false;

        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]==arr[i+1] ){
                reachedtop=true;
            }
            if((arr[i]>arr[i+1] && !reachedtop) ||(arr[i]<arr[i+1] && reachedtop)){
                return false;
            }      
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        if(hill(arr)){
            System.out.println("Hill");
        }else{
            System.out.println("Not a Hill");
        }

    }
}
