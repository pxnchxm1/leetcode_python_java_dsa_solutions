//i:p=>12-> [2,3,4,6,12] o:p=5
//Hackerrank -> BaseCase
public class numbersystem {
    public static void main(String[] args) {
    int n =4;
    int count=0;
    for(int i=2;i<=n;i++){
        if(n%i==0){
        count++;
        }
    }
    System.out.println(count);
    }
}
