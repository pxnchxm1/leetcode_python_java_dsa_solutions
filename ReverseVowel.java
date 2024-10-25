public class ReverseVowel {
   
        public static String reverseVowels(String s) {
            String vowels = "aeiouAEIOU";
            char[] chars = s.toCharArray();
            int l=0;
            int r= chars.length-1;
            while(l<=r){
                if(vowels.indexOf(chars[l])!=-1 &&  vowels.indexOf(chars[r])!=-1){
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                    l++;
                    r--;
                }
                if(vowels.indexOf(chars[l])== -1){
                    l++;
                }
                if(vowels.indexOf(chars[r])== -1){
                    r--;
                }
            }
            return new String(chars);  
    }
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }
}
