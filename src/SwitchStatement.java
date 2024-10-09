public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A":
                System.out.println("Wow, Anda lulus dengan baik");
                break;
            case "B":
                System.out.println("AH..bagus anda lulus");
                break;
            case "C":
                System.out.println("Bersyukur anda masih lulus");
                break;
            case "D":
                System.out.println("Ngulang tahun depan");
                break;

            default:
                System.out.println("Mungkin anda salah jurusan wkwkwk");

        }
        ;
        String fruit = "mango";
        switch (fruit) {
            case "mango" -> System.out.println("Oh this my favorite");
            case "orange" -> System.out.println("oh this my second favorite");
            case "banana" -> System.out.println(" oh this my third favorite");
            case "apple", "grape" -> System.out.println("i like too");
            default -> System.out.println("i dont like it");
        }
        ;

        String ucapan = switch (fruit) {
            case "mango":
                yield "Oh this my favorite";
            case "orange":
                yield "oh this my second favorite";
            case "banana":
                yield "oh this my third favorite";
            case "apple", "grape":
                yield "i like too";
            default:
                yield "i dont like it";
        };

        System.out.println(ucapan);
    }
}
