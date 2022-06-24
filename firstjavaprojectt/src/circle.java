import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        float r;
        float c;

        c = 2*22/7;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Radius");
        r=s.nextFloat() ;
        System.out.println("the value of radius is:" +r*c);

    }
}
