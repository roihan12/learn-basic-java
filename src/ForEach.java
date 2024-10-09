public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Roihan", "Sori", "Nasution"
        };

        for (var i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("FOR EACH");

        for (var value : names) {
            System.out.println(value);
        }
    }
}
