import java.util.Scanner;

public class Timep {
    public static void main(String[] args) {
        int num1,num2,sum;
        Scanner sc= new Scanner(System.in);

        System.out.println("enter number");
        num1 = sc.nextInt();

        System.out.println("enter number two");
        num2 = sc.nextInt();
        sum = num1+num2;

        System.out.println("addition of two num is:" +sum);
    }
}
