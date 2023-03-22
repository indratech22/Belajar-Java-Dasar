public class Array {

    public static void main(String[] args) {
        String[] stringArray;
        stringArray = new String[3];
        stringArray[0] = "Indra";
        stringArray[1] = "Wijaya";
        stringArray[2] = "S";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        int[] intArray = new int[]{
                22,23,24,25,26
        };

        long[] arrayLong = {
                222,223,224,225
        };
        System.out.println(intArray[0]);
        System.out.println(arrayLong[2]);
        System.out.println(stringArray.length);

        String[][] members = {
                {"indra","wijaya","S"},
                {"Alexsander","Hendra","wijaya"},
                {"Thomas","Wilson","Sujanto"}
        };

        System.out.println(members[1][2]);
    }

}
