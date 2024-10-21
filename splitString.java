class Solution {
    private void backtrack(String s,int start,Set<String> list,int c,int[] count){
        if(c+(s.length()-start)<=count[0]) return;
        if(start==s.length()){
            count[0] = Math.max(count[0],c);
            return;
        }
        for(int i=start+1;i<=s.length();++i){
            String sub = s.substring(start,i);
            if(!list.contains(sub)){
                list.add(sub);
                backtrack(s,i,list,c+1,count);
                list.remove(sub);
            }
        }
    }
    public int maxUniqueSplit(String s) {
        Set<String> list = new HashSet<>();
        int[] count={0};
        backtrack(s,0,list,0,count);
        return count[0]; 
    }
}
