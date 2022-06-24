import java.util.Scanner;

public class practticejava {
    public static void main(String[] args) {
        int age;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the age");
        age=s.nextInt();

        if (age>20){
            System.out.println("you are an adult");
        }
        else {
            System.out.println("you are not an adult");
        }
    }
}
