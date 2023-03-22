public class VariableArgument {

    public static void main(String[] args) {


        sayCongrats("Indra Wijaya", 85,90,85,75,87);
    }

    static void sayCongrats(String name, int... values){

        int total =0;
        for (var value :values){
            total += value;
        }
        int finalValue = total / values.length;

        int hasil = finalValue;

        if (finalValue >=75){
            System.out.println("selamat "+ name + ",Anda Lulus dengan hasil" + hasil);
        } else {
            System.out.println("Maaf "+ name + ",Anda Tidak Lulus dengan hasil" + " " + hasil);
        }
    }

}
