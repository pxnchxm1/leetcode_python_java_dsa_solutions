
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
public class guessgame {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random(10);
        int score1=0;
        int score2=0;
        int c_one,c_two;
        List<Integer>  c_choice = new ArrayList<>();
        List<Integer>  choice_one = new ArrayList<>();
        List<Integer>  choice_two = new ArrayList<>();
        
        while(c_choice.size()<5){
            int choice = r.nextInt(10)+1;
            if(!c_choice.contains(choice)){
                c_choice.add(choice);
            }
        }
        System.out.println("Enter first player name : ");
        String name1 = sc.next();
        System.out.println("Enter second player name : ");
        String name2 = sc.next();
        for(int i =0;i<3;i++){
            System.out.println("Enter Player 1 choice : ");
            c_one = sc.nextInt();
           while ((choice_one.contains(c_one)) || (choice_two.contains(c_one))){
             System.out.println("Already chosen, enter another number");
             c_one= sc.nextInt();
           }
           choice_one.add(c_one);
           if(c_choice.contains(c_one)){
            System.out.println("Correct");
           }
           else{
            System.out.println("wrong");
           }
            System.out.println("Enter Player 2 choice : ");
            c_two = sc.nextInt();
           while ((choice_one.contains(c_two)) || (choice_two.contains(c_two))){
             System.out.println("Already chosen, enter another number");
             c_two= sc.nextInt();
           }
           choice_two.add(c_two);
           if(c_choice.contains(c_two)){
            System.out.println("Correct");
           }
           else{
            System.out.println("wrong");
           }
        }
        if(score1>score2){
            System.out.println("Player 1 wins");
        }
        else if(score2>score1){
            System.out.println("Player 2 wins");
        }
        else{
            System.out.println("Draw");
        }
    }
    
}
