
import java.util.Scanner;

public class subsequencedivisible {
    
    public static void main(String[] args) {
        // int n= 1215598;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String num = Integer.toString(n);
        int count=0;
        for(int l=0;l<num.length();l++){
            for(int r=l;r<num.length();r++){
                if(Integer.parseInt(num.substring(l, r+1))%11==0){
                    count+=1;
                }
            }
            
        }
        System.out.println(count);
        sc.close();
        
    }
    
}

