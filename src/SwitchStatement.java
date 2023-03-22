public class SwitchStatement {

    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Anda Lulus Dengan Predikat Baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda Lulus");
                break;
            case "D":
                System.out.println("Anda Tidak Lulus");
                break;
            default:
                System.out.println("Anda Salah Jurusan");
        }
        switch (nilai){
            case "A" -> System.out.println("Anda Lulus Dengan Predikat Baik");
            case "B" , "C" -> System.out.println("Anda Lulus");
            case "d" -> System.out.println("Anda Tidak Lulus");
            default -> {
                System.out.println("Anda Salah Jurusan");
            }
        }
        String ucapan;
        switch (nilai){
            case "A" -> ucapan = "Anda Lulus Dengan Predikat Baik";
            case "B" , "C" -> ucapan = "Anda Lulus";
            case "d" -> ucapan = "Anda Tidak Lulus";
            default -> {
                ucapan = "Anda Salah Jurusan";
            }
        }
        System.out.println(ucapan);

        ucapan = switch (nilai){
            case "A": yield "Anda Lulus Dengan Predikat Baik";
            case "B" , "C" : yield "Anda Lulus";
            case "d" : yield "Anda Tidak Lulus";
            default : {
               yield  "Anda Salah Jurusan";
            }
        };
        System.out.println(ucapan);
        }
    }


