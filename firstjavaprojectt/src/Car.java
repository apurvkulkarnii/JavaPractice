public class Car {
    int carNo;
    String carName;
    double price;
    Car(int carNo,String carName,double price){
        System.out.println("in parameterised   constructor");

        this.carNo=carNo;
        this.carName=carName;
        this.price=price;
    }

    public Car() {
        this(101,"mercedes",4545);
        System.out.println("in default constructor");

    }

    void display(){

        System.out.println("Car details");
        System.out.println("Car no:" +carNo);
        System.out.println("carName:" +carName);
        System.out.println("car price:" +price);

    }
}
class CarImp1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }

        }
