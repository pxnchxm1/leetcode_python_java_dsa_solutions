import java.util.ArrayList;
import java.util.List;
class Permutation{
    public static List<String> helper(String str, String perm, int idx, List<String> perms){
      if(str.length()==0){
        perms.add(perm);
        return perms;
      }
      for(int i=0;i<str.length();i++){
        char curr= str.charAt(i);
        String newstr = str.substring(0,i)+ str.substring(i+1);
        helper(newstr, perm+curr, idx+1, perms);

      }
      return perms;
    }
    public static void main(String[] args) {
        String s1 ="ab";
        String s2 = "eidbaooo";
        List<String> perms = new ArrayList<>();
        helper(s1,"",0,perms);
        for (int i=0;i<perms.size();i++){
            if(s2.contains(perms.get(i))){
                System.out.println(true);
                break;
            }
        }
    }
}