


public class spiralmatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4,5,6},
                        {7,8,9,10,11,12},
                        {13,14,15,16,17,18},
                        {19,20,21,22,23,24},
                        {25,26,27,28,29,30}};
        
        int top=0;
        int bottom = mat.length-1;
        int left =0;
        int right=mat[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
            System.out.println(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.println(mat[i][right]);
            }
           right--;
           if(left<right){
              for(int i=right;i>=left;i--){
            System.out.println(mat[bottom][i]);
           }
           }
           bottom--;

           for(int i = bottom;i>=top;i--){
            System.out.println(mat[i][left]);
           }
           left++;
        }

    }
   
    

}
