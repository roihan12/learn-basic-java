public class Variable {
    public static void main(String[] args) {

        String name;
        name = "Roihan Sori";

        int age = 22;
        String address = "Bogor";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        name = "Nasution";
//        name = 100; cannot cast to int

        System.out.println(name);

//        var hello; // will error

        var hello = "Selamat Siang";

//hello = 79; // will error


        final String myFirstname = "Roihan";

//        myFirstname = "Sori"; // will error


    }
}
