import java.util.ArrayList;
import java.util.List;
public class ConcatenatedSubstring {
    public static List<List<String>> permarray(String[] words, List<String> newwords, List<List<String>> permarraylist) {
        if (words.length == 0) {
            permarraylist.add(new ArrayList<>(newwords)); // Add a copy of newwords to permarraylist
            return permarraylist;
        }

        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String[] rest = new String[words.length - 1];

            int j = 0;
            for (int w = 0; w < words.length; w++) {
                if (w != i) { // Exclude the current word
                    rest[j++] = words[w];
                }
            }
            newwords.add(word);
            permarray(rest, newwords, permarraylist);
            newwords.remove(newwords.size() - 1);
        }

        return permarraylist;
    }

    public static void main(String[] args) {
        String s = "barfoothefoobarman"; // This variable is not used in the current implementation
        String[] words = {"foo", "bar"};
        List<Integer>  result = new ArrayList<>();
        List<String> newwords = new ArrayList<>();
        List<List<String>> permarraylist = new ArrayList<>();
        
        permarray(words, newwords, permarraylist);
        System.out.println(permarraylist);
       
        for(int i=0;i<permarraylist.size();i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<permarraylist.get(i).size();j++){
                sb.append(permarraylist.get(i).get(j));
            }
            String w = sb.toString();
            if(s.contains(w)){
                result.add(s.indexOf(w));
            }
        }
        System.out.println(result);
    }
}
