public class TypeDataNotPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000000L;

        Byte iniByte = null;

        System.out.println(iniByte);
        iniByte = 100;
        System.out.println(iniByte);

        //Conversion TO NOT PRIMITIF

        int iniInt2 = 100;

        Integer iniInteger2 = iniInt2;

        System.out.println(iniInteger2);

        short shortInt = iniInteger2.shortValue();
        byte byteInt = iniInteger2.byteValue();
        float floatInt = iniInteger2.floatValue();

        Long amount = 1000000L;
        

    }
}
