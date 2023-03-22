public class TIpeDataBukanPrimitif {


    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 10000L;

        Byte iniByte = null;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObject = iniInt;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();


    }

}
