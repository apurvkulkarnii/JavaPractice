import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        char letter;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Letter");
        letter=s.next().charAt(0);
        switch (letter){
            case 's':
            case 'S':
                System.out.println("Sunday");

                break;
            case 'm':
            case 'M':
                System.out.println("Monday");
                break;
            case 't':
            case'T':
                System.out.println("Tuesday");
                break;
            case 'w':
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'h':
            case 'H':
                System.out.println("Thursday");
                break;
            case 'f':
            case 'F':

                System.out.println("Friday");
                break;
            case 'z':
            case 'Z':
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Wrong choice");

        }
    }
}
