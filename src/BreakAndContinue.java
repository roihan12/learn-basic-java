public class BreakAndContinue {
    public static void main(String[] args) {
//        var counter = 1;

//        while (true) {
//            System.out.println("Perulangan " + counter);
//            counter++;
//
//            if (counter > 10) {
//                break;
//            }
//        }

        for (int counter1 = 1; counter1 <= 100; counter1++) {
            if (counter1 % 2 != 0) {
                continue;
            }
            System.out.println("Perulangan genap " + counter1);
        }

        System.out.println("Perulangan berhenti");
    }
}
