import java.util.Scanner;

public class Switchpractice {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the age");
        age=s.nextInt();
        switch (age){
            case 12:
                System.out.println("you are 12 years old");
                break;
            case 56:
                System.out.println("you are 56 years old");
                break;
            case 16 :
                System.out.println("you are 16 years old");
                break;
            default:
                System.out.println("you did not match any of cases");
        }

    }
}
