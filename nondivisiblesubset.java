// import java.util.ArrayList;
// import java.util.List;

// public class nondivisiblesubset {
//     public static List<List<Integer>> helper(List<List<Integer>> ans,int[] arr,List<Integer> perm,int idx){
//         if(idx==0){
//             ans.add(new ArrayList<>(perm));
//             return ans;
//         }
//         for(int i=0;i<arr.length;i++){
//             int curr =arr[i];
//             int[] newarr = new int[arr.length-1];
//             for(int j=0,k=0;j<arr.length;j++){
//                 if(j!=i){
//                     newarr[k++]=arr[j];
//                 }
            

//             }
//             perm.add(curr);
//             helper(ans,newarr,perm,idx+1);
//             perm.remove(perm.size()-1);
//         }
//         return ans;

//     }
//     public static void main(String[] args) {
//         int[] arr ={1,7,2,4};
//        // int k =3;
//         ArrayList<Integer> ans = new ArrayList<>();
//         helper(ans,arr,new ArrayList<Integer>(),0);

//     }
    
// }
