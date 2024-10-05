import java.util.Random;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Enter Team1 :");
        String team1 = sc.next();
        System.out.println("Enter Team 2 : ");
        String team2 = sc.next();

        int ans1 = r.nextInt(300)+1;
        int ans2 = r.nextInt(300)+1;
        
        String[]  hint1 = new String[3];
        String[]  hint2 = new String[3];
        hint1[0] = (ans1>150) ? "It is greater than 150" : "It is lesser than 150";
        hint1[1] = (ans1%2==0) ? "It is even number ":"It is odd number";
        hint1[2] = (ans1%3==0) ? "It is divisible by 3 ":"It is not divisible by 3";

        hint2[0] = (ans1>150) ? "It is greater than 150" : "It is lesser than 150";
        hint2[1] = (ans1%2==0) ? "It is even number ":"It is odd number";
        hint2[2] = (ans1%3==0) ? "It is divisible by 3 ":"It is not divisible by 3";
        int hint1number = 0;
        System.out.println("Team 1 Chance to Play :");
        for(int i=0;i<3;i++){
          System.out.println("Do you want any hints? Y/N");
          String ch = sc.next();
          if(ch.equalsIgnoreCase("y")){
            System.out.println("Hint " + (i+1) + hint1[i]);
            hint1number++;
          }
          else{
            break;
          }
        }
        int hint2number = 0;
        System.out.println("Now you can give your prediction(1-300 : )");
        int guess1=sc.nextInt();
        int score1 = (300 - (25*hint1number)) - (Math.abs(ans1-guess1));
        System.out.println("Team1 Score is "+ score1);
        System.out.println("--------------------------------------------------");
        System.out.println("Team 2 Chance to Play :");
        for(int i=0;i<3;i++){
          System.out.println("Do you want any hints? Y/N");
          String ch1 = sc.next();
          if(ch1.equalsIgnoreCase("y")){
            System.out.println("Hint " + (i+1) + hint2[i]);
            hint2number++;
          }
          else{
            break;
          }
        }
        System.out.println("Now you can give your prediction(1-300 : )");
        int guess2=sc.nextInt();
        int score2 = (300 - (25*hint2number)) - (Math.abs(ans2-guess2));
        System.out.println("Team2 Score is "+ score2);

        if(score1>score2){
            System.out.println("Team 1 wins");
         }else if(score2>score1){
            System.out.println("Team2 wins");
         } else{
            System.out.println("Draw");
         }
    }
}
