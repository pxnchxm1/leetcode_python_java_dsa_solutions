
import java.util.Scanner;

public class fourdmatrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][][][] arr = new int[4][3][2][2];
            System.out.println("Entwr elements");
            for(int i=0;i<4;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<2;k++){
                        for(int l=0;l<2;l++){
                            System.out.printf("Enter a[%d][%d][%d][%d]",i,j,k,l);
                            arr[i][j][k][l] = sc.nextInt();
                        }
                    }
                }
            }
            System.out.println("The matrix is : ");
            for(int i=0;i<4;i++){
                System.out.printf("\n---------------Block[%d]--------------",(i+1));
                for(int j=0;j<3;j++){
                    System.out.printf("---------------SubBlock[%d]--------------",(j+1));
                    for(int k=0;k<2;k++){
                        for(int l=0;l<2;l++){
                            System.out.print(arr[i][j][k][l]+" ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            sc.close();


        
    }
}

// HW -----ASCENDING DESCENDING