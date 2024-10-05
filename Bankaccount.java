import java.util.Scanner;
public class Bankaccount {
    public static void main(String[] args) {
        int balance =0;
        System.out.print("Menu\n1: CheckBalance\n2:DepositAmount\n3:Withdraw\n4:Exit\n");
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("Enter your choice : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Your balance is: "+balance);
                    break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    balance+=sc.nextInt();
                    System.out.println("Successfully deposited \n Balance amount :"+balance);
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw");
                    int amnt=sc.nextInt();
                    if(amnt<=balance){
                        balance-=amnt;
                        System.out.println("Withdrawal successful\n Balance amount :"+balance);
                    }
                    else{
                        System.out.println("Insufficient Balance");
                    }   break;
                case 4:
                System.out.println("Exiting...");
                break;
                default:
                    System.out.println("Invalid Choice!\nPlease select from 1-3");
                    break;
            }

        }while(menu!=4);
        sc.close();
        
    }
    
}
