public class Employee {
    public static void main(String[] args) {

    }
    int id;
    String name;
    String CompanyName;
    Employee(){
        System.out.println("in default constructor");
    }
    void display(){

        System.out.println("id:" +id);
        System.out.println("name:" +name);
        System.out.println("CompanyName:" +CompanyName);
    }
}
class Employeeimp{
    public static void main(String[] args) {
        Employee e1= new Employee();
        e1.display();
        Employee e2= new Employee();
        e2.display();
    }


}
