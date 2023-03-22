public class ForEach {

    public static void main(String[] args) {
        String[] array = {
                "indra", "Wijaya", "S",
                "Belajar", "Java", "Dasar"
        };

        //for(int i= 0; i < array.length; i++){
        for (String hasil : array) {
            System.out.println(hasil);
        }
    }

}
