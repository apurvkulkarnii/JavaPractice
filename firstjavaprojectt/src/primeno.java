import java.util.Scanner;
public class primeno {
    public static void main(String[] args) {
        int num, i, p = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        num = s.nextInt();
        for (i = 2; i < num; i++)
        {
            if (num % i == 0)
            {

                p++;
                break;
            }

        }
        if (p == 0)
            System.out.println("it is prime no");
        else {


            System.out.println("it is not prime no");
        }

    }
}