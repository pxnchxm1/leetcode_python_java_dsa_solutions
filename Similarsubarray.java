
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Similarsubarray{

    public static void main(String[] args) {
        System.out.println("Enter limit :\n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            set.add(arr[i]);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i : set){
            List<Integer> sub = new ArrayList<Integer>();
            for(int j=0;j<arr.length;j++){
                if(arr[j]==i){
                    sub.add(arr[j]);
                    System.out.println(arr[j]);
                }
            }
            ans.add(sub);
        }
        System.out.println(ans);
        
        
        

    }
}