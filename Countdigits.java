public class Countdigits {
    
    public static int countNumbersWithUniqueDigits(int n) {
        
        if (n == 0) return 1; 
       if (n == 1) return 10; 

       int count = 10; 
       int uniqueDigits = 9; 
       int availableDigits = 9; 

       for (int i = 2; i <= Math.pow(10,n); i++) {
           count += uniqueDigits * availableDigits; 
           System.out.print(count+ "__");
           uniqueDigits--; 
           availableDigits--; 
       }

       return count;
   }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countNumbersWithUniqueDigits(n));
    }
}
