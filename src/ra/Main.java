package ra;

import java.util.Scanner;
import ra.util.Student;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student ss = new Student();

        // nhóm kiểu dữ liệu nguyên thủy (primitive)  :
        // bao gồm int, long, double, float, boolean,
        int a = 10;

        // dẫn đến khi a thay đổi thì b không thay đổi theo
        int b = a;
        a=100;
        System.out.println(" a = "+a);
        System.out.println(" b = "+b);

        // nhóm kiểu dữ liệu tham chiếu (non-primitive)
        // bảo gồm các kiểu class
//        Person person = new Person();
//        // khi person thay đổi thì person 1 thay đổi theo
//        Person person1 = person;
//        person.age=100;
//        System.out.println(" ps = "+person.age);
//        System.out.println(" ps1 = "+person1.age);

        // từ khóa static
        System.out.println(Person.name);
        // phương thức static có thể gọi trực tiếp từ lớp
        Person.sayHello();

        Person ps1 = new Person(10);
        Person ps2 = new Person(100);
        System.out.println(ps1.name);
//        System.out.println(ps1.age);

        System.out.println(ps2.name);
//        System.out.println(ps2.age);

        // thay đổi giá của static
        Person.name = "Khánh";
        System.out.println(Person.name);;
        System.out.println(ps1.name);
        System.out.println(ps2.name);

        // thay đổi từ đối tượng
        ps1.name ="Nghĩa";
        System.out.println(Person.name);;
        System.out.println(ps1.name);
        System.out.println(ps2.name);

        // sử dụng static class
        Person.Author author =new Person.Author();
    }
}
