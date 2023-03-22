public class IfStatement {

    public static void main(String[] args) {

        var nilai1 = 60;
        var nilai2 = 75;

        if (nilai1 >= 75 && nilai2 >=75){
            System.out.println("Anda Lulus");
        } else {
            System.out.println("Anda Tidak Lulus");
        }

        if(nilai1 >=80 && nilai2 >=80){
            System.out.println("Nilai Anda A");
        } else if(nilai1 >=70 && nilai2 >=70) {
            System.out.println("Nilai Anda B");
        } else if(nilai1 >=60 && nilai2 >=60) {
            System.out.println("Nilai Anda C");
        } else if(nilai1 >=50 && nilai2 >=50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

    }

}
