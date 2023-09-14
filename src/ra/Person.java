package ra;

public class Person {
    static {
        int a = 0 ;
        int b;
        System.out.println("Chạy đầu tiên");
    }
    private int age ;
    static  String name =  "Hùng";

    public Person(int age) {
        this.age = age;
        System.out.println("Chạy sau");
    }
    // phương thức
    static void sayHello(){

        System.out.println("Hello !");
    }
    static void sayHi(){
        System.out.println("Hi !");
    }
    void sayHo(){
        System.out.println("hoho !");
    }
    // class static
    static class Author{
        public Author() {
//            System.out.println(age);
        }

        String name;
    }
}
