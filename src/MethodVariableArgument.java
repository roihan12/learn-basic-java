public class MethodVariableArgument {
    public static void main(String[] args) {
        int[] values = {90, 70, 60, 80, 90, 70};
        sayCongrats("Roihan", values);
        sayCongrats2("Roihan", 50, 60, 40, 90, 100, 60);
    }

    static void sayCongrats(String name, int[] values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");

        }

    }

    static void sayCongrats2(String name, int... values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Selamat " + name + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + name + ", Anda Tidak Lulus");

        }

    }


}
