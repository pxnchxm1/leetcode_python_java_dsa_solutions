public class Patterns {
    public static void Pattern1(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 2*n-2*i; j>=0; j-- ){
                System.out.print("*");
            }
        System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 2*n-2*i; j>=0; j-- ){
                System.out.print("*");
            }
        System.out.println();
        }
       return;
    }
    public static void Pattern2(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 2*n-2*i; j>=0; j-- ){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 2*n-2*i; j>=0; j-- ){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
       return;
    }
    public static void main(String[] args) {
        int n =5;
        //Pattern1(n);
        Pattern2(n);
    }
    
}
