public class OperatorBoolean {

    public static void main(String[] args) {

        var nilaiUjian = 80;
        var nilaiAbsen = 80;

        var lulusUjian = nilaiUjian >=75;
        var lulusAbsen = nilaiAbsen >=75;

        var lulusSekolah = lulusAbsen && lulusUjian;

        System.out.println(lulusSekolah);

    }

}
