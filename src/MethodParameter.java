public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Roihan", "sori", 22);
    }

    static void sayHello(String firstName, String lastname, Integer age) {
        System.out.println("Hello my name is " + firstName + " " + lastname + " and my age " + age);
    }
}
