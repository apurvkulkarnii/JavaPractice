import java.util.Scanner;

public class CalculatorEx {
    public static void main(String[] args) {
        int no1,no2;
        Scanner scanner = new Scanner(System.in);
        char ch;
        int result;
        do{

            System.out.println("Enter no 1");
            no1 = scanner.nextInt();
            System.out.println("Enter non 2");
            no2 = scanner.nextInt();
            System.out.println("1.Addition");
            System.out.println("2.Substraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulo");
            System.out.println("Enter your choice number");
            int choice = scanner.nextInt();
            switch (choice){
                case 1: result=no1+no2;
                    System.out.println("Addition is" +result);
                break;
                case 2: result=no1-no2;
                    System.out.println("Substraction is" +result);
                    break;
                case 3: result=no1*no2;
                    System.out.println("Multiplication is" +result);
                    break;
                case 4: result=no1/no2;
                    System.out.println("Divison is" +result);
                    break;
                case 5: result=no1%no2;
                    System.out.println("Modulo is" +result);
                    break;
                default:
                    System.out.println("wrong choice");

            }
            System.out.println("Do you want to continue");
            ch = scanner.next().charAt(0);
        }while (ch== 'Y'|| ch== 'y' );

    }
}
