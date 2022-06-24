import java.util.Scanner;

public class student {
    int rno;
    String name;
    String address;
    float age;

    void insertData(int r, String nm, String addr, float a) {
        rno = r;
        name = nm;
        address = addr;
        age = a;

    }

    void display() {
        System.out.println("Student Details");
        System.out.println("Roll no: " + rno);
        System.out.println("name:" + name);
        System.out.println("Address:" + address);
        System.out.println("Age:" + age);


    }

}

    class studentimp1{
        public static void main(String[] args) {
            student s1 = new student();
            s1.rno = 1;
            s1.name = "amul";
            s1.address="pune";
            s1.age = 4.5f;


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rno");
            int rno = sc.nextInt();
            System.out.println("Enter name");
            String nm = sc.next();
            System.out.println("Enter Address");
            String addr = sc.next();
            System.out.println("Enter age");
            float age = sc.nextFloat();

            student s2 = new student();
            s2.insertData(rno,nm,addr,age);
            s2.insertData(1,"messi","Argentina",45);
            s2.display();





    }





    }

