import  java.util.Scanner;
public class Speed {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int speed = sc.nextInt();
        if(speed>=0 && speed<=10){
            System.out.println("The mileage of the car is " + 30 + "km/hr");
        }
        else if(speed>=10 && speed<=20){
            System.out.println("The mileage of the car is " + 40 + "km/hr");
        }
        else if(speed>=20 && speed<=30){
            System.out.println("The mileage of the car is " + 35 + "km/hr");
        }
        else{
            System.out.println("The mileage of the car is " + 32 + "km/hr");
        }
        sc.close();
        

    }
}
