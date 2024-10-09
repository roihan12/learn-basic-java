public class TypeDataArray {
    public static void main(String[] args) {
        String[] arrayString;

        arrayString = new String[3];

        arrayString[0] = "Roihan";
        arrayString[1] = "Sori";
        arrayString[2] = "Nasution";
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);

        arrayString[0] = "Raihan";
        System.out.println(arrayString[0]);

        String[] stringArray2 = new String[4];


        String[] nameLong = {"Roihan", "Sori", "Nasution"};

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5
        };

        long[] arrayLong = {
                10L, 20L, 30L,
        };
        System.out.println(arrayInt.length - 1);

        arrayLong[0] = 0;

        nameLong[0] = null;


        String[][] members = {{"Roihan", "Java"}, {"sori", "Go"}, {"nasution", "JavaSCRIPT"}};
        System.out.println(members[0]);
        System.out.println(members[0][1]);

    }
}
