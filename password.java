import java.util.Scanner;
public class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password");
        String pass = sc.nextLine();
        int spcl=0;
        int number=0;
        int low=0;
        int upper=0;
        if(pass.length()<8){
            System.out.println("Not a strong password");
        }
        for(int i=0;i<pass.length();i++){
            Character ch = pass.charAt(i);
            if(ch.isDigit(ch)){
                number++;
            }
            else if(ch.isUpperCase(ch)){
                upper++;
            }
            else if(ch.isLowerCase(ch)){
                low++;
            }
            else{
                spcl++;
            }
        }
        if(number==0 || upper==0 || low==0|| spcl==0){
            System.out.println("Weak Password");
        }
        else{
            System.out.println("Strong Password");
        }
        sc.close();

    }
}
