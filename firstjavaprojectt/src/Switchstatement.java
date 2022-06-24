import java.util.Scanner;
import java.util.SortedMap;

public class Switchstatement {
    public static void main(String[] args) {
        int num;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        num= s.nextInt();
        switch (num){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wed");
                break;
            case 5:
                System.out.println("Today is thursday");
                break;
            case 6:
                System.out.println("Today is friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("No match found");
        }

    }
}
