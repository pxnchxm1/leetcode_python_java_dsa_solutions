import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Score :");
        int score = scanner.nextInt();
        if(score<=100 && score>=90){
            System.out.println("A Grade ");
        }
        else if(score<=89 && score>=80){
            System.out.println("B  Grade ");
        }
        else if(score<=79 && score>=70){
            System.out.println("C Grade");
        }
        else if (score<=69 && score>=60){
            System.out.println("D Grade");
        }
        else if (score<=59 && score>=0){
            System.out.println("Better Luck Next Time 😏");
        }
        else{
            System.out.println("Invalid Score");
            }
    scanner.close();
    }

    
}
