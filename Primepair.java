// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Primepair {
    public static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int flag=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            return true;
        }else{
             return false;
        }
    }
    public static void main(String[] args) {
        int n=8;
        for(int i=2;i<=n;i++){
           if(prime(i) && prime(n-i) ){
                   System.out.println(i+" "+(n-i));
 
           }
            
        }
    }
}