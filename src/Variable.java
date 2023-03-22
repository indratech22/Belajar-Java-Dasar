public class Variable {

    public static void main(String[] args) {
        String nama;
        nama = "Indra Wijaya";

        var usia = 23;
        var alamat = "Indonesia";

        System.out.println(nama);
        System.out.println(usia);
        System.out.println(alamat);

        nama = "Budi Nugroho";
        usia = 50;
        alamat = "Belanda";
        System.out.println(nama);
        System.out.println(usia);
        System.out.println(alamat);

        final var namaIstri = "helina";
        //namaIstri = "gabby"; // error
        System.out.println(namaIstri);
    }

}
