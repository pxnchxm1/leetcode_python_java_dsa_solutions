
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tallertree {
 
    public static int Tallesttree(HashMap<Integer,Integer> map){
        int max=0;
        for(Map.Entry<Integer,Integer> i : map.entrySet()){
            int h = i.getKey()*12 +  i.getValue();
            if(h>max){
                max=h;
            }
        }

    return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),sc.nextInt());
        }
        System.out.println(Tallesttree(map));

        
    }
}
