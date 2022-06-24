import java.sql.SQLOutput;
import java.util.Scanner;
public class practiceswitch2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter month");
        String ch = sc.next();
        switch (ch){
            case "jan":
                System.out.println("january");
                break;
            case"feb":
                System.out.println(" february " );
                break;
            case"mar":
                System.out.println(" march " );
                break;
            case"apr":
                System.out.println(" april " );
                break;
            case"may":
                System.out.println("may");
                break;
            case"ju":
                System.out.println("june");
                break;
            case"july":
                System.out.println("july");
                break;
            case"aug":
                System.out.println("august");
                break;
            case"sep":
                System.out.println("september");
                break;
            case"oct":
                System.out.println("october");
                break;
            case"nov":
                System.out.println("november");
                break;
            case "dec":
                System.out.println("december");
                break;
            default:
                System.out.println("kfjnrnfkjrjnfrjonjf");
        }


    }
}
