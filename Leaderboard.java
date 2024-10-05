
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

// public class Leaderboard{
//     public static List<Integer> helper(List<Integer> ranked,List<Integer>players) {
//         ArrayList<Integer> ranklist = new ArrayList<>();
//         for(int i=0;i<ranked.size();i++){
//             if(!ranklist.contains(ranked.get(i)))
//                 ranklist.add(ranked.get(i));
//             }
//         Collections.sort(ranklist);
//         Collections.reverse(ranklist);
//         ArrayList<Integer> ranks = new ArrayList<>();
        
//         for(int score:players){
//             int idx = ranklist.size()-1;
//             while(idx>=0 && ranklist.get(idx)<=score){
//                 idx--;
//             }
//             ranks.add(idx+2);
//         }
//         return ranks;
//     }
//     public static void main(String[] args) {
//         List<Integer> ranked= {100,90,90,80};
//         List<Integer> players ={70,80,105};
//         System.out.println(helper(ranked,players));
//     }
// }