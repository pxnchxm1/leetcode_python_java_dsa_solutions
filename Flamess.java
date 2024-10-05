import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Flamess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name1 : ");
        String name1 = sc.nextLine();
        System.out.println("Enter name2 : "); 
        String name2 = sc.nextLine();
        List<Character> l1 = new ArrayList<>();
        for(char letter : name1.toCharArray()){
              l1.add(letter);
        }
        List<Character> l2 = new ArrayList<>();
        for(char letter : name2.toCharArray()){
              l2.add(letter);
        }

        for(int i=0;i<l1.size();i++){
           // System.out.println(name1.subSequence(i, i+1));
            for(int j=0;j<l2.size();j++){
                if(l1.get(i)==l2.get(j)){
                    l1.set(i,'#');
                    l2.set(j,'#');
                }
            }
            
        }
        int count=0;
        for(Character i : l1){
            if(!i.equals('#')){
                count++;
            }
        }
        for(Character i : l2){
            if(!i.equals('#')){
                count++;
            }
       }
       List<Character> flames = new ArrayList<>(Arrays.asList('F','L','A','M','E','S'));
       int f=0;
       while(flames.size()!=1){
        f = (f + (count-1)) % flames.size() ;
        flames.remove(f);
       }
       System.out.println(flames);
    }
}
