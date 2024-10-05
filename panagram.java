
import java.util.HashSet;

public class panagram{
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')
                set.add(str.charAt(i));
        }
        System.out.println(set);
        if(set.size()==26){
            System.out.println("Panagram");
        }else{
            System.out.println("Not a Panagram");
        }

                            
                            
    }

}